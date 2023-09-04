package modelo.jpa;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import modelo.DAO.MovimientoDAO;
import modelo.entidades.Categoria;
import modelo.entidades.Cuenta;
import modelo.entidades.Movimiento;
import modelo.entidades.TipoCategoria;
import modelo.entidades.TipoMovimiento;

public class JPAMovimientoDAO extends JPAGenericDAO<Movimiento, Integer> implements MovimientoDAO {

	public JPAMovimientoDAO() {
		super(Movimiento.class);
	
	}
	public List<Movimiento> getMovimientos(){
		String sentencia = "SELECT m FROM Movimiento m";		
		Query query = em.createQuery(sentencia);		
		return query.getResultList();		
	}
	
	@Override
	public List<Movimiento> getMovimientoByTipo(String tipo){
		TipoMovimiento tipoMov= null;
		System.out.println("Entro a la consulta");
		String jpql = null;
		if(tipo == TipoMovimiento.GASTO.getNombreTipoMovimiento()) {
			tipoMov = TipoMovimiento.GASTO;
			jpql = "SELECT m FROM Movimiento m where m.tipo = :tipo";
		}
		if(tipo == TipoMovimiento.INGRESO.getNombreTipoMovimiento()) {
			tipoMov = TipoMovimiento.INGRESO;
			jpql = "SELECT m FROM Movimiento m where m.tipo = :tipo";
		}
		if(tipo == TipoMovimiento.TRANSFERENCIA.getNombreTipoMovimiento()) {
			tipoMov = TipoMovimiento.TRANSFERENCIA;
			jpql = "SELECT m FROM Movimiento m where m.tipo = :tipo";
		}
	    Query query = em.createQuery(jpql);
	    query.setParameter("tipo", tipoMov);
	    List<Movimiento> movimientos = query.getResultList();
	    return movimientos;
	}
			
	public List<Movimiento> getMovimientosByFecha(Date fecha){
		String sentencia = "SELECT m FROM Movimiento m WHERE m.fecha =:fecha";
		
		Query query = em.createQuery(sentencia);
		query.setParameter("fecha", fecha);
		return query.getResultList();
	}

	

}
