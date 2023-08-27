package modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="Movimiento")
public class Movimiento implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="monto")
	private double monto;
	
	@Enumerated(EnumType.STRING)
	private TipoMovimiento tipo;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "cuenta_destino")
	private Cuenta cuentaDestino;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "cuenta_origen")
	private Cuenta cuentaOrigen;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Temporal(TemporalType.DATE)
	private Date fecha;
	


	public Movimiento() {
		
	}
	
	

	public Movimiento(int id, double monto, TipoMovimiento tipo, Categoria categoria, Cuenta cuentaDestino,
			Cuenta cuentaOrigen, String descripcion, Date fecha) {
		super();
		this.id = id;
		this.monto = monto;
		this.tipo = tipo;
		this.categoria = categoria;
		this.cuentaDestino = cuentaDestino;
		this.cuentaOrigen = cuentaOrigen;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}



	public Movimiento(int id, double monto, TipoMovimiento tipo, Categoria categoria, Cuenta cuentaDestino,
			String descripcion, Date fecha) {
		super();
		this.id = id;
		this.monto = monto;
		this.tipo = tipo;
		this.categoria = categoria;
		this.cuentaDestino = cuentaDestino;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public TipoMovimiento getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimiento tipo) {
		this.tipo = tipo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Cuenta getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(Cuenta cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

	public Cuenta getCuentaOrigen() {
		return cuentaOrigen;
	}
	
	public void setCuentaOrigen(Cuenta cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Movimiento [id=" + id + ", monto=" + monto + ", tipo=" + tipo + ", cuentaDestino=" + cuentaDestino
				+ ", cuentaOrigen=" + cuentaOrigen + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", categoria=" + categoria + "]";
	}
	
	

}
