package modelo.jpa;

import modelo.DAO.CategoriaDAO;
import modelo.DAO.CuentaDAO;
import modelo.DAO.DAOFactory;
import modelo.DAO.MovimientoDAO;
import modelo.DAO.PersonaDAO;

public class JPADAOFactory extends DAOFactory {

	@Override
	public PersonaDAO getPersonaDAO() {
		
		return new JPAPersonaDAO();
	}

	//falta implementar lo de cuenta
	@Override
	public CuentaDAO getCuentaDAO() {
		// TODO Auto-generated method stub
		return new JPACuentaDAO();
	}
	
	public MovimientoDAO getMovimientoDAO() {
		return new JPAMovimientoDAO();
	}
	
	public CategoriaDAO getCategoriaDAO() {
		return new JPACategoriaDAO();
	}
}
