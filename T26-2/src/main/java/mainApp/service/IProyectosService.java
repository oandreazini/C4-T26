package mainApp.service;

import java.util.List;

import mainApp.dto.Proyectos;


public interface IProyectosService {

	//Metodos del CRUD
	public List<Proyectos> listProyectos(); //Listar All 

	public Proyectos saveProyectos(Proyectos proyectos);	//Guarda un Proyectos CREATE

	public Proyectos proyectosXID(Integer id); //Leer datos de un Proyectos READ

	public Proyectos updateProyectos(Proyectos proyectos); //Actualiza datos del Proyectos UPDATE

	public void deleteProyectos(Integer id);// Elimina el Proyectos DELETE

}
