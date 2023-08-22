package modelo.DAO;

import modelo.entidades.Persona;

public interface PersonaDAO extends GenericDAO<Persona, Integer>{
	public Persona autorizar(String nombre, String password);
	
}
