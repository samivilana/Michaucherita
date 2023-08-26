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

	public List<String> listarCuentas(Integer id){
		String sentencia = "SELECT c.nombreCuenta FROM Cuenta c WHERE c.propietario = :propietario";
		
		Query query = em.createQuery(sentencia);
		query.setParameter("propietario", id);
		List<String> nombresCuentas = query.getResultList();
		return nombresCuentas;
	}

}
