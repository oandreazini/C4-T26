package mainApp.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cientificos")
public class Cientificos {

	// Atributos de entidad piezas
	@Id
	private String dni;
	@Column(name = "nombre_apellidos") 
	private String nombre_apellidos;

	@OneToMany
	@JoinColumn(name="dni")
	private List<AsignadoA> asignadoA;
	
	//Constructores
	public Cientificos() {
	
	}
	
	/**
	 * 
	 * @param dni
	 * @param nombre_apellidos
	 * @param asignadoA
	 */
	public Cientificos(String dni, String nombre_apellidos, List<AsignadoA> asignadoA) {
		this.dni = dni;
		this.nombre_apellidos = nombre_apellidos;
		this.asignadoA = asignadoA;
	}
	
	// getter y setter
	/**
	 * 
	 * @return
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * 
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * 
	 * @return
	 */
	public String getNombre_apellidos() {
		return nombre_apellidos;
	}
	
	/**
	 * 
	 * @param nombre_apellidos
	 */
	public void setNombre_apellidos(String nombre_apellidos) {
		this.nombre_apellidos = nombre_apellidos;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<AsignadoA> getAsignadoA() {
		return asignadoA;
	}
	
	/**
	 * 
	 * @param asignadoA
	 */
	public void setAsignadoA(List<AsignadoA> asignadoA) {
		this.asignadoA = asignadoA;
	}

	@Override
	public String toString() {
		return "Cientificos [dni=" + dni + ", nombre_apellidos=" + nombre_apellidos + ", asignadoA=" + asignadoA + "]";
	}

}
