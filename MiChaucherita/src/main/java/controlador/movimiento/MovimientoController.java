	package controlador.movimiento;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import modelo.DAO.DAOFactory;
import modelo.entidades.Categoria;
import modelo.entidades.Cuenta;
import modelo.entidades.Movimiento;
import modelo.entidades.TipoCategoria;
import modelo.entidades.TipoMovimiento;

@WebServlet("/MovimientoController")
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

		case "mostrarDashboard":
			this.mostrarDashboard(request, response);
			break;
		case "ingreso":
			this.ingreso(request, response);
			break;
		case "egreso":
			this.egreso(request, response);
			break;
		case "transferencia":
			this.transferencia(request, response);
			break;
		case "mostrarMovimientos":
			this.mostrarMovimientos(request, response);
			break;
		case "mostrarMovimientosbyFecha":
			this.mostrarMovimientosByFecha(request, response);
			break;
		case "mostrarMovimientosbyTipo":
			this.mostrarMovimeintosByTipo(request, response);
			break;
		case "error":
			break;
		default:
			break;
		}
	}

	private void mostrarMovimeintosByTipo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipoMovimiento = request.getParameter("tipoMov");
		System.out.println("Entro");
		
		List<Movimiento> movimientosTipo = DAOFactory.getFactory().getMovimientoDAO().getMovimientoByTipo(tipoMovimiento);
		
		for (Movimiento movimiento : movimientosTipo) {
			System.out.println(movimiento);
		}
		request.setAttribute("movimientos", movimientosTipo);
		request.getRequestDispatcher("jsp/cuentas.jsp").forward(request, response);
		
	}

	private void mostrarMovimientosByFecha(HttpServletRequest request, HttpServletResponse response) throws ParseException, ServletException, IOException {
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
		Date fecha = formatoFecha.parse(request.getParameter("fecha"));
		
		List<Movimiento> movimietosFecha = DAOFactory.getFactory().getMovimientoDAO().getMovimientosByFecha(fecha);
		List<Cuenta> nombresCuentas = DAOFactory.getFactory().getCuentaDAO().listarCuentas();
		request.setAttribute("cuentas",nombresCuentas);
		
		request.setAttribute("movimientos", movimietosFecha);
		request.getRequestDispatcher("jsp/cuentas.jsp").forward(request, response);
	}

	private void mostrarMovimientos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Movimiento> movimientos = DAOFactory.getFactory().getMovimientoDAO().getMovimientos();
		List<Cuenta> nombresCuentas = DAOFactory.getFactory().getCuentaDAO().listarCuentas();
		
		request.setAttribute("movimientos", movimientos);
		request.setAttribute("cuentas",nombresCuentas);
		
		
		request.getRequestDispatcher("jsp/cuentas.jsp").forward(request, response);
	}

	private void transferencia(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Cuenta> nombresCuentas = DAOFactory.getFactory().getCuentaDAO().listarCuentas();
		List<Categoria> nombreCategorias = DAOFactory.getFactory().getCategoriaDAO().listarCategoriaByTipo(TipoCategoria.TRANSFERENCIA);
		
		request.setAttribute("cuentas", nombresCuentas);
		request.setAttribute("categorias",nombreCategorias);

		request.getRequestDispatcher("jsp/transferencia.jsp").forward(request, response);
		
	}

	private void egreso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("entro");
		List<Cuenta> nombresCuentas = DAOFactory.getFactory().getCuentaDAO().listarCuentas();
		List<Categoria> nombreCategorias = DAOFactory.getFactory().getCategoriaDAO().listarCategoriaByTipo(TipoCategoria.GASTO);
		
		request.setAttribute("cuentas", nombresCuentas);
		request.setAttribute("categorias",nombreCategorias);

		request.getRequestDispatcher("jsp/egreso.jsp").forward(request, response);
		
	}

	private void ingreso(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("Entro");
		List<Cuenta> nombresCuentas = DAOFactory.getFactory().getCuentaDAO().listarCuentas();
		List<Categoria> nombreCategorias = DAOFactory.getFactory().getCategoriaDAO().listarCategoriaByTipo(TipoCategoria.INGRESO);
		
		
		
		for (Cuenta cuenta : nombresCuentas) {
			System.out.println(cuenta);
			
		}
		
		request.setAttribute("cuentas", nombresCuentas);
		request.setAttribute("categorias",nombreCategorias);
		
		//response.sendRedirect("jsp/ingreso.jsp");
		request.getRequestDispatcher("jsp/ingreso.jsp").forward(request, response);
	}

	private void mostrarDashboard(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect("jsp/dashboard.jsp");
		
	}

	private void registrarIngreso(HttpServletRequest request, HttpServletResponse response)
			throws ParseException, ServletException, IOException {
		// 1.- Obtener datos que me envían en la solicitud
		double monto = Double.parseDouble(request.getParameter("monto"));
		int idCuentaDestino = Integer.parseInt(request.getParameter("cuentaDestino"));
		String descripcion = request.getParameter("descripcion");
		int idCategoria = Integer.parseInt(request.getParameter("categoria"));
		Categoria categoria = DAOFactory.getFactory().getCategoriaDAO().getById(idCategoria);
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
		Date fecha = null;
		fecha = formatoFecha.parse(request.getParameter("fecha"));
		
		// 2.- Llamo al Modelo para obtener datos
		Movimiento ingreso = new Movimiento();
		Cuenta cuentaDestino = DAOFactory.getFactory().getCuentaDAO().getById(idCuentaDestino);

		ingreso.setCuentaDestino(cuentaDestino);
		ingreso.setMonto(monto);
		ingreso.setDescripcion(descripcion);
		ingreso.setCategoria(categoria);
		ingreso.setFecha(fecha);
		ingreso.setTipo(TipoMovimiento.INGRESO);

		DAOFactory.getFactory().getMovimientoDAO().create(ingreso);
		cuentaDestino.setSaldototal(cuentaDestino.getSaldototal() + monto);
		System.out.println(cuentaDestino.getSaldototal());
		DAOFactory.getFactory().getCuentaDAO().update(cuentaDestino);
		
		// 3.- Llamo a la Vista
		mostrarDashboard(request, response);

	}

	private void registrarGasto(HttpServletRequest request, HttpServletResponse response) throws ParseException, IOException {
		
		System.out.println("entra");
		double monto= Double.parseDouble(request.getParameter("monto"));
		int idCuentaOrigen = Integer.parseInt(request.getParameter("cuentaOrigen"));
		String descripcion = request.getParameter("descripcion");
		int idCategoria = Integer.parseInt(request.getParameter("categoria"));
		Categoria categoria = DAOFactory.getFactory().getCategoriaDAO().getById(idCategoria);
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
		Date fecha = null;
		fecha = formatoFecha.parse(request.getParameter("fecha"));
		
		// 2.- Llamo al Modelo para obtener datos
		
		Movimiento egreso = new Movimiento();
		
		Cuenta cuentaOrigen = DAOFactory.getFactory().getCuentaDAO().getById(idCuentaOrigen);

		egreso.setMonto(monto);
		egreso.setCuentaOrigen(cuentaOrigen);
		egreso.setDescripcion(descripcion);
		egreso.setCategoria(categoria);
		egreso.setFecha(fecha);
		egreso.setTipo(TipoMovimiento.GASTO);
		
		if(cuentaOrigen.getSaldototal() > monto) {
			//System.out.println("Saldo insuficiente");
			DAOFactory.getFactory().getMovimientoDAO().create(egreso);
			cuentaOrigen.setSaldototal(cuentaOrigen.getSaldototal()- monto);
			System.out.println(cuentaOrigen.getSaldototal());
			DAOFactory.getFactory().getCuentaDAO().update(cuentaOrigen);
			
			mostrarDashboard(request, response);
		}else {
			response.sendRedirect("jsp/errorsaldo.jsp");
		}
		
		
		
		// 3.- Llamo a la Vista
			

		


	}

	private void registrarTransferencia(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ParseException {
		System.out.println("entro");
		double monto = Double.valueOf(request.getParameter("monto"));
		int idCuentaOrigen= Integer.parseInt(request.getParameter("cuentaOrigen"));
		int idCuentaDestino = Integer.parseInt(request.getParameter("cuentaDestino"));
		String descripcion = request.getParameter("descripcion");
		int idCategoria = Integer.parseInt(request.getParameter("categoria"));
		Categoria categoria = DAOFactory.getFactory().getCategoriaDAO().getById(idCategoria);
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
		Date fecha = null;
		Movimiento transferencia = new Movimiento();
		fecha = formatoFecha.parse(request.getParameter("fecha"));
		
		// 2.- Llamo al Modelo para obtener datos
		Cuenta cuentaOrigen = DAOFactory.getFactory().getCuentaDAO().getById(idCuentaOrigen);
		Cuenta cuentaDestino = DAOFactory.getFactory().getCuentaDAO().getById(idCuentaDestino);
		if(cuentaOrigen.getId().equals(cuentaDestino.getId())) {
			System.out.println("error misma cuenta");
		}

		transferencia.setMonto(monto);
		transferencia.setCuentaOrigen(cuentaOrigen);
		transferencia.setCuentaDestino(cuentaDestino);
		transferencia.setDescripcion(descripcion);
		transferencia.setCategoria(categoria);
		transferencia.setFecha(fecha);
		transferencia.setTipo(TipoMovimiento.TRANSFERENCIA);
		
		if(cuentaOrigen.getSaldototal()>monto) {
			DAOFactory.getFactory().getMovimientoDAO().create(transferencia);
			cuentaOrigen.setSaldototal(cuentaOrigen.getSaldototal()-monto);
			DAOFactory.getFactory().getCuentaDAO().update(cuentaOrigen);
			
			cuentaDestino.setSaldototal(cuentaDestino.getSaldototal()+monto);
			DAOFactory.getFactory().getCuentaDAO().update(cuentaDestino);
			mostrarDashboard(request, response);
		}else {
			response.sendRedirect("jsp/errorsaldo.jsp");
		}
		
		// 3.- Llamo a la Vista
		

	}
/*
	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.- Obtener datos que me envían en la solicitud

		// 2.- Llamo al Modelo para obtener datos
		List<Cuenta> nombresCuentas = DAOFactory.getFactory().getCuentaDAO().listarCuentas();
		List<Categoria> nombreCategorias = DAOFactory.getFactory().getCategoriaDAO().listarCategoria();

		// 3.- Llamo a la Vista
		request.setAttribute("cuentas", nombresCuentas);
		request.setAttribute("categorias", nombreCategorias);
		;
		request.getRequestDispatcher("/jsp/ingreso.jsp").forward(request, response);

	}*/

}
