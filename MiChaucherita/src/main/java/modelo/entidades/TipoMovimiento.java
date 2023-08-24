package modelo.entidades;

public enum TipoMovimiento {
	INGRESO ("INGRESO", 1),
	GASTO ("GASTO", 2),
	TRANSFERENCIA ("TRANSFERENCIA",3);
	private String nombreTipoMovimiento;
	private int idTipo;
	
	private TipoMovimiento(String nombreTipo, int idTipo) {
		this.nombreTipoMovimiento = nombreTipo;
		this.idTipo = idTipo;
	}

	public String getNombreTipoMovimiento() {
		return nombreTipoMovimiento;
	}

	public void setNombreTipoMovimiento(String nombreTipo) {
		this.nombreTipoMovimiento = nombreTipo;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	
	
	
}
