package TestEntityManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.entidades.Cuenta;
import modelo.entidades.Persona;

public class TestEntityManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("michaucherita");
		EntityManager em= emf.createEntityManager();
	
		//Insertar una persona
		Persona p1 = new Persona(1,"diana","carolina123");
		em.getTransaction().begin();
		em.persist(p1);
		em.getTransaction().commit();
		
		//Insertar cuentas
		Cuenta Pichincha = new Cuenta("Pichincha",1000);
		em.getTransaction().begin();
		em.persist(Pichincha);
		em.getTransaction().commit();
		
		Cuenta Efectivo = new Cuenta("Efectivo",500);
		em.getTransaction().begin();
		em.persist(Efectivo);
		em.getTransaction().commit();
		
		
	}

}
