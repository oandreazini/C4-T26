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
@Table(name = "proyectos")
public class Proyectos {

	// Atributos de entidad proyectos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "horas")
	private String horas;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<AsignadoA> asignadoA;
	
	//Constructores
	
	public Proyectos() {
	}
	
	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param horas
	 * @param asignadoA
	 */
	public Proyectos(int id, String nombre, String horas, List<AsignadoA> asignadoA) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.asignadoA = asignadoA;
	}


	// getter y setter
	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getHoras() {
		return horas;
	}
	
	/**
	 * 
	 * @param horas
	 */
	public void setHoras(String horas) {
		this.horas = horas;
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
		return "Proyectos [id=" + id + ", nombre=" + nombre + ", horas=" + horas + ", asignadoA=" + asignadoA + "]";
	}	
	
}
