package test;

import modelo.DAO.DAOFactory;

public class testDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAOFactory.getFactory().getPersonaDAO().autorizar("diana", "carolina123");

	}

}
