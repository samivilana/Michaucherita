package modelo.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cuenta")
public class Cuenta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nombreCuenta")
	private String nombreCuenta;
	
	@Column(name="saldototal")
	private double saldototal;
	
	@ManyToOne(cascade =CascadeType.REFRESH )
	@JoinColumn(name="propietario")
	private Persona propietario;
	
	//no entiendo bien lo de ingreso,egreso,egreso/ingreso a donde perteneceria eso :c

	public Cuenta() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreCuenta() {
		return nombreCuenta;
	}

	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}

	public double getSaldototal() {
		return saldototal;
	}

	public void setSaldototal(double saldototal) {
		this.saldototal = saldototal;
	}

}
