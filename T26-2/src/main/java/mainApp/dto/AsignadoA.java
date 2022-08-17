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

	// Atributos de entidad asignado_a
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "cientifico")
	private Cajeros cajeros;

	@ManyToOne
	@JoinColumn(name = "proyecto")
	private Proyectos proyectos;


	//Constructores
	public AsignadoA() {
	}
	
	/**
	 * 
	 * @param id
	 * @param cajeros
	 * @param proyectos
	 */
	public AsignadoA(int id, Cajeros cajeros, Proyectos proyectos) {
		this.id = id;
		this.cajeros = cajeros;
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
	public Cajeros getCientificos() {
		return cajeros;
	}
	
	/**
	 * 
	 * @param cajeros
	 */
	public void setCientificos(Cajeros cajeros) {
		this.cajeros = cajeros;
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
		return "AsignadoA [id=" + id + ", cajeros=" + cajeros + ", proyectos=" + proyectos + "]";
	}

}
