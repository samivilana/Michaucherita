package modelo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import modelo.DAO.GenericDAO;

public class JPAGenericDAO<T, ID> implements GenericDAO<T, ID>{

	private Class<T> persinstentClass; //no importa la clase que venga es generico
	protected EntityManager em;
	
	public JPAGenericDAO(Class <T> clasePersistente) {
		this.persinstentClass = clasePersistente;
		this.em = Persistence.createEntityManagerFactory("michaucherita").createEntityManager();
	}
	
	@Override
	public T getById(ID id) {
		return em.find(persinstentClass, id);
		
	}

	@Override
	public List<T> getAll() {
		
		return null;
	}

	@Override
	public void create(T entity) {
		em.getTransaction().begin();
		try {
			em.persist(entity);
			em.getTransaction().commit();
		}catch (Exception e) {
			System.err.println("error de inserccion");
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
		
	}

	@Override
	public void delete(T entity) {
		em.getTransaction().begin();
		try {
			em.merge(entity);
			em.getTransaction().commit();
		}catch (Exception e) {
			System.err.println("error de actualizacion");
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
	}

	@Override
	public void deleteById(ID id) {
		T entity = this.getById(id);
		if(entity!= null) {
			this.delete(entity);
		}
	}

	@Override
	public void update(T entity) {
		
		em.getTransaction().begin();
		try {
			em.remove(entity);
			em.getTransaction().commit();
		}catch (Exception e) {
			System.err.println("error de eliminar");
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
	}

}
