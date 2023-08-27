package modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import modelo.DAO.CuentaDAO;
import modelo.DAO.PersonaDAO;
import modelo.entidades.Cuenta;

public class JPACuentaDAO extends JPAGenericDAO<Cuenta, Integer> implements CuentaDAO  {
	public JPACuentaDAO() {
		super(Cuenta.class);
		// TODO Auto-generated constructor stub
	}
	
	public List<Cuenta> listarCuentas(){
		String sentencia = "SELECT * FROM Cuenta c ";
		
		Query query = em.createQuery(sentencia);		
		//List<Cuenta> nombCuentas = query.getResultList();
		List<Cuenta> cuentas = query.getResultList();
		return cuentas;
	}
	
	

}
