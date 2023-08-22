package modelo.jpa;

import javax.persistence.Query;

import modelo.DAO.PersonaDAO;
import modelo.entidades.Persona;

public class JPAPersonaDAO extends JPAGenericDAO<Persona, Integer> implements PersonaDAO {

	public JPAPersonaDAO() {
		super(Persona.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Persona autorizar(String nombre, String password) {
		String sentencia = "SELECT p FROM Persona p WHERE p.nombre= :nombre AND p.clave= :clave";

		Query query = em.createQuery(sentencia);
		// Parametros ....
		query.setParameter("nombre", nombre);
		query.setParameter("password", password);

		Persona personaAutorizada = (Persona) query.getSingleResult();
		return personaAutorizada;
	}


}
