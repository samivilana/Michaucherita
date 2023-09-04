package modelo.DAO;

import java.util.List;

import modelo.entidades.Categoria;
import modelo.entidades.TipoCategoria;
import modelo.jpa.JPAGenericDAO;

public interface CategoriaDAO extends GenericDAO<Categoria, Integer>{
	public List<Categoria> listarCategoria();
	public List<Categoria> listarCategoriaByTipo(TipoCategoria tipo);
	public void addCategoria(Categoria c);
	public void delete(int id);
	
}
