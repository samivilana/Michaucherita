package modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import modelo.DAO.CategoriaDAO;
import modelo.entidades.Categoria;
import modelo.entidades.Cuenta;


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
}
