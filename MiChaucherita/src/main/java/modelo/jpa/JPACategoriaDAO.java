package modelo.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import modelo.DAO.CategoriaDAO;
import modelo.entidades.Categoria;
import modelo.entidades.Cuenta;
import modelo.entidades.TipoCategoria;

public class JPACategoriaDAO extends JPAGenericDAO<Categoria, Integer> implements CategoriaDAO {

	public static List<Categoria> categorias = null;

	public JPACategoriaDAO() {
		super(Categoria.class);
	}

	public List<Categoria> listarCategoria() {
		String jpql = "SELECT t FROM Categoria t";
		Query query = em.createQuery(jpql);
		categorias = query.getResultList();
		return categorias;

	}

	@Override
	public List<Categoria> listarCategoriaByTipo(TipoCategoria tipo) {
		String jpql = null;
		if (tipo == TipoCategoria.GASTO) {
			jpql = "SELECT t FROM Categoria t where t.tipo = :tipo";
		}
		if (tipo == TipoCategoria.INGRESO) {
			jpql = "SELECT t FROM Categoria t where t.tipo = :tipo";
		}
		if (tipo == TipoCategoria.TRANSFERENCIA) {
			jpql = "SELECT t FROM Categoria t where t.tipo = :tipo";
		}
		Query query = em.createQuery(jpql);
		query.setParameter("tipo", tipo);
		categorias = query.getResultList();
		return categorias;
	}

	public void addCategoria(Categoria c) {
		this.listarCategoria().add(c);
	}

	public void delete(int id) {
		em.getTransaction().begin();
		try {
			Categoria categoria = em.find(Categoria.class, id);
			if (categoria != null) {
				em.remove(categoria);
			}
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Error");
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}

	}
}
