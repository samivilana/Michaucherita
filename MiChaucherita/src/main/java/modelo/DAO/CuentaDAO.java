package modelo.DAO;

import java.util.List;

import modelo.entidades.Cuenta;

public interface CuentaDAO extends GenericDAO<Cuenta, Integer> {
	public List<String> listarCuentas(Integer id);

}
