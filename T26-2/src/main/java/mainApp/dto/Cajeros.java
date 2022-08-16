package mainApp.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cientificos")
public class Cajeros {

	// Atributos de entidad cientificos
	
	@Id
		
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "nombre_apellidos") 
	private String nombre_apellidos;

	@OneToMany
	@JoinColumn(name="dni")
	private List<AsignadoA> asignadoA;
	
	//Constructores
	public Cajeros() {
	
	}
	
	/**
	 * 	
	 * @param id
	 * @param dni
	 * @param nombre_apellidos
	 * @param asignadoA
	 */
	public Cajeros(String dni, String nombre_apellidos, List<AsignadoA> asignadoA) {
		
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
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
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
		return "Cajeros [dni=" + dni + ", nombre_apellidos=" + nombre_apellidos + ", asignadoA=" + asignadoA + "]";
	}

}
