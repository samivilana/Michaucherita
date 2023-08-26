package modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Persona")
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="password")
	private String password;
//private List<CuentaBancaria> cuentas;

	public Persona() {

	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setContraseña(String contraseña) {
		this.password = contraseña;
	}

	public Persona(Integer id, String usuario, String contraseña) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.password = contraseña;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", usuario=" + usuario + ", password=" + password + "]";
	}
	
	

}
