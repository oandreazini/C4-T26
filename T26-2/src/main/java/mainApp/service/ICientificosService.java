package mainApp.service;

import java.util.List;

import mainApp.dto.Cientificos;

public interface ICientificosService {
	
	//Metodos del CRUD
	public List<Cientificos> listCientificos(); //Listar All 

	public Cientificos saveCientificos(Cientificos cientificos);	//Guarda un Cientificos CREATE

	public Cientificos cientificosXID(String dni); //Leer datos de un Cientificos READ

	public Cientificos updateCientificos(Cientificos cientificos); //Actualiza datos del Cientificos UPDATE

	public void deleteCientificos(String dni);// Elimina el Cientificos DELETE

}
