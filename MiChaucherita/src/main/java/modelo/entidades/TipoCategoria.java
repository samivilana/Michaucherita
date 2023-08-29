package modelo.entidades;

public enum TipoCategoria {
	INGRESO ("INGRESO", 1),
	GASTO ("GASTO", 2),
	TRANSFERENCIA ("TRANSFERENCIA",3);
	
	private String nombreTipoCategoria;
	private int idTipo;
	
	TipoCategoria(String nombreTipo, int idTipo) {
		this.nombreTipoCategoria = nombreTipo;
		this.idTipo = idTipo;
	}

	public String getNombreTipoMovimiento() {
		return nombreTipoCategoria;
	}

	public void setNombreTipoMovimiento(String nombreTipo) {
		this.nombreTipoCategoria = nombreTipo;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
}
