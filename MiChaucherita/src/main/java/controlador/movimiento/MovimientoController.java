package controlador.movimiento;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAO.DAOFactory;
import modelo.entidades.Categoria;
import modelo.entidades.Cuenta;
import modelo.entidades.Movimiento;
import modelo.entidades.TipoMovimiento;

@WebServlet("/movimientoController")
public class MovimientoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MovimientoController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			this.ruteador(request, response);
		} catch (IOException | ServletException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			this.ruteador(request, response);
		} catch (IOException | ServletException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void ruteador(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ParseException {
		String ruta = (request.getParameter("ruta") == null) ? "listarCuentas" : request.getParameter("ruta");

		switch (ruta) {
		case "registrarIngreso":
			this.registrarIngreso(request, response);
			break;
		case "registrarGasto":
			this.registrarGasto(request, response);
			break;
		case "registrarTransferencia":
			this.registrarTransferencia(request, response);
			break;
		case "listar":
			this.listar(request, response);
			break;
		case "error":
			break;
		default:
			break;
			
		}
	}

	private void registrarIngreso(HttpServletRequest request, HttpServletResponse response) throws ParseException, ServletException, IOException  {
		// 1.- Obtener datos que me envían en la solicitud
		double monto = Double.parseDouble(request.getParameter("monto"));
		int idCuentaDestino = Integer.parseInt(request.getParameter("cuentaDestino"));
		String descripcion = request.getParameter("descripcion");
		int idCategoria = Integer.parseInt(request.getParameter("categoria"));
		Categoria categoria = DAOFactory.getFactory().getCategoriaDAO().getById(idCategoria);
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/mm/aaaa");
		Date fecha = null;
		Movimiento ingreso = new Movimiento();
		fecha = formatoFecha.parse(request.getParameter("fecha"));
		
		Cuenta cuentaDestino = DAOFactory.getFactory().getCuentaDAO().getById(idCuentaDestino);
		
		ingreso.setCuentaDestino(cuentaDestino);
		ingreso.setMonto(monto);
		ingreso.setDescripcion(descripcion);
		ingreso.setCategoria(categoria);
		ingreso.setFecha(fecha);
		ingreso.setTipo(TipoMovimiento.INGRESO);
		
		DAOFactory.getFactory().getMovimientoDAO().create(ingreso);
		cuentaDestino.setSaldototal(cuentaDestino.getSaldototal()+ monto);
		DAOFactory.getFactory().getCuentaDAO().update(cuentaDestino);
		
		


	}

	private void registrarGasto(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void registrarTransferencia(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	private void listar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		// 1.- Obtener datos que me envían en la solicitud

		// 2.- Llamo al Modelo para obtener datos
		
		

		// 3.- Llamo a la Vista
		

	}

}
