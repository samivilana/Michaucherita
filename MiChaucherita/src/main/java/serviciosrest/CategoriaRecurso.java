package serviciosrest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import modelo.DAO.CategoriaDAO;
import modelo.entidades.Categoria;
import modelo.jpa.JPACategoriaDAO;

@Path("/categoria")
public class CategoriaRecurso {
	
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public void guardarCategoria (Categoria c) {
		CategoriaDAO categoriaModelo = new JPACategoriaDAO();
		categoriaModelo.addCategoria(c);
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Categoria> getCategorias(){
		CategoriaDAO categoriaModelo = new JPACategoriaDAO();
		return categoriaModelo.listarCategoria();
	}
	
	@DELETE
	@Path("/delete/{id}")
	public void eliminarCategoriaById(@PathParam("id")int id) {
		CategoriaDAO categoriaModelo = new JPACategoriaDAO();
		categoriaModelo.delete(id);
	}
	
	

}
