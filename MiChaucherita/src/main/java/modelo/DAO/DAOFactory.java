package modelo.DAO;

import modelo.jpa.JPADAOFactory;

public abstract class DAOFactory {
	protected static DAOFactory factory= new JPADAOFactory(); //INYECCION DEPENDENCIAS
	
	public static DAOFactory getFactory() {
		return factory;
	}
	
	public abstract PersonaDAO getPersonaDAO();
	public abstract CuentaDAO getCuentaDAO();
}
