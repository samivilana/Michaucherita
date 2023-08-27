package modelo.jpa;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import modelo.DAO.CuentaDAO;

import modelo.entidades.Cuenta;

public class JPACuentaDAO extends JPAGenericDAO<Cuenta, Integer> implements CuentaDAO  {
	public JPACuentaDAO() {
		super(Cuenta.class);
		// TODO Auto-generated constructor stub
	}
	
	public List<Cuenta> listarCuentas() {
	    String jpql = "SELECT c FROM Cuenta c";
	    Query query = em.createQuery(jpql);
	    List<Cuenta> cuentas = query.getResultList();
	    return cuentas;
	
	}

}
