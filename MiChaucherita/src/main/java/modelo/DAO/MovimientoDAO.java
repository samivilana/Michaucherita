package modelo.DAO;

import java.util.Date;
import java.util.List;

import modelo.entidades.Movimiento;
import modelo.entidades.TipoMovimiento;

public interface MovimientoDAO extends GenericDAO<Movimiento, Integer> {
	public List<Movimiento> getMovimientos();
	public List<Movimiento> getMovimientosByFecha(Date fecha);	
	public List<Movimiento> getMovimientoByTipo(String tipo);
	
}
