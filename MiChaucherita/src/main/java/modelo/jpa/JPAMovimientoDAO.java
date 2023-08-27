package modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import modelo.DAO.MovimientoDAO;
import modelo.entidades.Movimiento;
import modelo.entidades.TipoMovimiento;

public class JPAMovimientoDAO extends JPAGenericDAO<Movimiento, Integer> implements MovimientoDAO {

	public JPAMovimientoDAO() {
		super(Movimiento.class);
	
	}
	
	public List<Movimiento> getMovimientosIngreso(){
		String sentencia = "SELECT m FROM Movimiento m WHERE m.tipo =:tipo";
		
		Query query = em.createQuery(sentencia);
		query.setParameter("tipo",TipoMovimiento.INGRESO);
		return query.getResultList();
	}
	
	public List<Movimiento> getMovimientosGasto(){
		String sentencia = "SELECT m FROM Movimiento m WHERE m.tipo =:tipo";
		
		Query query = em.createQuery(sentencia);
		query.setParameter("tipo", TipoMovimiento.GASTO);
		return query.getResultList();
	}
	
	public List<Movimiento> getMovimientosTransferencia(){
		String sentencia = "SELECT m FROM Movimiento m WHERE m.tipo =:tipo";
		
		Query query = em.createQuery(sentencia);
		query.setParameter("tipo", TipoMovimiento.TRANSFERENCIA);
		return query.getResultList();
	}
	

}
