package modelo.DAO;

import java.util.List;

import modelo.entidades.Movimiento;

public interface MovimientoDAO extends GenericDAO<Movimiento, Integer> {
	
	public List<Movimiento> getMovimientosIngreso();
	public List<Movimiento> getMovimientosGasto();
	public List<Movimiento> getMovimientosTransferencia();
	public List<Movimiento> getMovimientos();

	

}
