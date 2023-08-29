package modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import modelo.DAO.CategoriaDAO;
import modelo.entidades.Categoria;
import modelo.entidades.Cuenta;
import modelo.entidades.TipoCategoria;


public class JPACategoriaDAO extends JPAGenericDAO<Categoria, Integer> implements CategoriaDAO {


	public JPACategoriaDAO() {
		super(Categoria.class);
	}
	public List<Categoria> listarCategoria() {
	    String jpql = "SELECT t FROM Categoria t";
	    Query query = em.createQuery(jpql);
	    List<Categoria> categorias = query.getResultList();
	    return categorias;
	
	}
	
	
	@Override
	public List<Categoria> listarCategoriaByTipo(TipoCategoria tipo) {
		String jpql = null;
		if(tipo == TipoCategoria.GASTO) {
			jpql = "SELECT t FROM Categoria t where t.tipo = :tipo";
		}
		if(tipo == TipoCategoria.INGRESO) {
			jpql = "SELECT t FROM Categoria t where t.tipo = :tipo";
		}
		
	    Query query = em.createQuery(jpql);
	    query.setParameter("tipo", tipo);
	    List<Categoria> categorias = query.getResultList();
	    return categorias;		
	}
}
