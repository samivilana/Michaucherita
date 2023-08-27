package test;

import java.util.List;

import modelo.DAO.DAOFactory;
import modelo.entidades.Cuenta;

public class testDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Cuenta> nombresCuentas = DAOFactory.getFactory().getCuentaDAO().listarCuentas();

		for (Cuenta cuenta : nombresCuentas) {
		    System.out.println("ID: " + cuenta.getId());
		    System.out.println("Nombre de Cuenta: " + cuenta.getNombreCuenta());
		    System.out.println("Saldo: " + cuenta.getSaldototal());
		    System.out.println("---------------");
		}

	}

}
