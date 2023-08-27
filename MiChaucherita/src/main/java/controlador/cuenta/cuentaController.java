package controlador.cuenta;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import modelo.DAO.DAOFactory;
import modelo.entidades.Cuenta;

@WebServlet("/cuentaController")
public class cuentaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public cuentaController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.ruteador(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.ruteador(request, response);
	}

	private void ruteador(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String ruta = (request.getParameter("ruta") == null) ? "listarCuentas" : request.getParameter("ruta");

		switch (ruta) {
		case "listarCuentas":
			this.listarCuentas(request, response);
			break;
		case "error":
			break;
		default:
			break;
		}
	}

	private void listarCuentas(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.- Obtener datos que me envían en la solicitud

		// 2.- Llamo al Modelo para obtener datos
		List<Cuenta> nombresCuentas = DAOFactory.getFactory().getCuentaDAO().listarCuentas();
		for (Cuenta cuenta : nombresCuentas) {
		    System.out.println("ID: " + cuenta.getId());
		    System.out.println("Nombre de Cuenta: " + cuenta.getNombreCuenta());
		    System.out.println("Saldo: " + cuenta.getSaldototal());
		    // Imprime más atributos de la cuenta si es necesario
		    System.out.println("---------------");
		}
		// 3.- Llamo a la Vista
		request.setAttribute("cuentas", nombresCuentas);
		request.getRequestDispatcher("jsp/ingreso.jsp").forward(request, response);

	}

}
