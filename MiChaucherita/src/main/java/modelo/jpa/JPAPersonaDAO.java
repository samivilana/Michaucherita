package modelo.jpa;

import modelo.DAO.PersonaDAO;
import modelo.entidades.Persona;

public class JPAPersonaDAO extends JPAGenericDAO<Persona, Integer> implements PersonaDAO {

	public JPAPersonaDAO() {
		super(Persona.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Persona autorizar(String nombre, String contraseña) {
		// TODO Auto-generated method stub
		return null;
	}

}
