package TestEntityManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.catalina.webresources.Cache;

import modelo.entidades.Categoria;
import modelo.entidades.Cuenta;
import modelo.entidades.Persona;
import modelo.entidades.TipoCategoria;

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
		
		Categoria comida = new Categoria("Comida", TipoCategoria.GASTO);
		em.getTransaction().begin();
		em.persist(comida);
		em.getTransaction().commit();
		
		Categoria transporte = new Categoria("Transporte", TipoCategoria.GASTO);
		em.getTransaction().begin();
		em.persist(transporte);
		em.getTransaction().commit();
		
		Categoria nomina = new Categoria("Nomina", TipoCategoria.INGRESO);
		em.getTransaction().begin();
		em.persist(nomina);
		em.getTransaction().commit();
		
		Categoria transferenciaEntreCuentas = new Categoria("Transferencia entre cuentas", TipoCategoria.TRANSFERENCIA);
		em.getTransaction().begin();
		em.persist(transferenciaEntreCuentas);
		em.getTransaction().commit();
		
		Categoria cuidadoPersonal = new Categoria("Cuidado personal", TipoCategoria.GASTO);
		em.getTransaction().begin();
		em.persist(cuidadoPersonal);
		em.getTransaction().commit();
		
		Categoria varios = new Categoria("Varios", TipoCategoria.GASTO);
		em.getTransaction().begin();
		em.persist(varios);
		em.getTransaction().commit();
	}

}
