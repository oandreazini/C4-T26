package mainApp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "asignado_a")
public class AsignadoA {

	// Atributos de entidad piezas
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "cientifico")
	private Cientificos cientificos;

	@ManyToOne
	@JoinColumn(name = "proyecto")
	private Proyectos proyectos;


	//Constructores
	public AsignadoA() {
	}
	
	/**
	 * 
	 * @param id
	 * @param cientificos
	 * @param proyectos
	 */
	public AsignadoA(int id, Cientificos cientificos, Proyectos proyectos) {
		this.id = id;
		this.cientificos = cientificos;
		this.proyectos = proyectos;
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
	public Cientificos getCientificos() {
		return cientificos;
	}
	
	/**
	 * 
	 * @param cientificos
	 */
	public void setCientificos(Cientificos cientificos) {
		this.cientificos = cientificos;
	}
	
	/**
	 * 
	 * @return
	 */
	public Proyectos getProyectos() {
		return proyectos;
	}
	
	/**
	 * 
	 * @param proyectos
	 */
	public void setProyectos(Proyectos proyectos) {
		this.proyectos = proyectos;
	}

	@Override
	public String toString() {
		return "AsignadoA [id=" + id + ", cientificos=" + cientificos + ", proyectos=" + proyectos + "]";
	}

}
