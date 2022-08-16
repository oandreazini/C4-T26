package mainApp.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "proveedores") // en caso que la tabla sea diferente
public class Proveedores {
		
		// Atributos de entidad proveedores
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
		private int codigo;
		@Column(name = "nombre") // no hace falta si se llama igual
		private String nombre;
		
		@OneToMany
	    @JoinColumn(name="codigo")
	    private List<Suministra> suministra;
		
		//Constructores
		public Proveedores() {
		}
		
		/**
		 * 
		 * @param id
		 * @param nombre
		 * @param suministra
		 */
		public Proveedores(int id, String nombre, List<Suministra> suministra) {
			this.codigo = id;
			this.nombre = nombre;
			this.suministra = suministra;
		}
		
		// getter y setter
		
		/**
		 * 
		 * @return
		 */
		public int getId() {
			return codigo;
		}
		
		/**
		 * 
		 * @param id
		 */
		public void setId(int codigo) {
			this.codigo = codigo;
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
		public List<Suministra> getSuministra() {
			return suministra;
		}
		
		/**
		 * 
		 * @param suministra
		 */
		public void setSuministra(List<Suministra> suministra) {
			this.suministra = suministra;
		}

		@Override
		public String toString() {
			return "Proveedores [codigo=" + codigo + ", nombre=" + nombre + ", suministra=" + suministra + "]";
		}	

}