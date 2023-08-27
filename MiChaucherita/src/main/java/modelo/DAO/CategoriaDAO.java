package modelo.DAO;

import java.util.List;

import modelo.entidades.Categoria;
import modelo.jpa.JPAGenericDAO;

public interface CategoriaDAO extends GenericDAO<Categoria, Integer>{
	public List<Categoria> listarCategoria();
}
