package controlador.cuenta;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.persistence.internal.oxm.schema.model.List;

import modelo.DAO.DAOFactory;

@WebServlet("/cuentaController")
public class cuentaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public cuentaController() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.ruteador(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.ruteador(request, response);
	}
	private void ruteador(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
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


	private void listarCuentas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.- Obtener datos que me envían en la solicitud

		// 2.- Llamo al Modelo para obtener datos
		//List nombresCuentas =  (List) modelo.DAO.DAOFactory.getFactory().getCuentaDAO().listarCuentas(1);
		

		// 3.- Llamo a la Vista
		//request.setAttribute("nombresCuentas", nombresCuentas);
        //request.getRequestDispatcher("/vista.jsp").forward(request, response);
		
	}


}
