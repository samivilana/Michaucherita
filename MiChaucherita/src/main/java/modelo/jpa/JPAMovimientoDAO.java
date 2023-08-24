package modelo.jpa;

import modelo.DAO.MovimientoDAO;
import modelo.entidades.Movimiento;

public class JPAMovimientoDAO extends JPAGenericDAO<Movimiento, Integer> implements MovimientoDAO {

	public JPAMovimientoDAO(Class<Movimiento> clasePersistente) {
		super(clasePersistente);
		// TODO Auto-generated constructor stub
	}

}
