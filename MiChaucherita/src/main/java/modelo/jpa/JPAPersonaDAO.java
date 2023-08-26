package modelo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.DAO.PersonaDAO;
import modelo.entidades.Persona;

public class JPAPersonaDAO extends JPAGenericDAO<Persona, Integer> implements PersonaDAO {

	public JPAPersonaDAO() {
		super(Persona.class);
		// TODO Auto-generated constructor stub
	}


	@Override
	public Persona autorizar(String usuario, String password) {
		String sentencia = "SELECT p FROM Persona p WHERE p.usuario= :usuario AND p.password= :password";

		Query query = em.createQuery(sentencia);
		// Parametros ....
		query.setParameter("usuario", usuario);
		query.setParameter("password", password);

		Persona personaAutorizada = (Persona) query.getSingleResult();
		return personaAutorizada;
	}


}
