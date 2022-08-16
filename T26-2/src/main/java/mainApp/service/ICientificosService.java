package mainApp.service;

import java.util.List;

import mainApp.dto.Cajeros;

public interface ICientificosService {
	
	//Metodos del CRUD
	public List<Cajeros> listCientificos(); //Listar All 

	public Cajeros saveCientificos(Cajeros cajeros);	//Guarda un Cajeros CREATE

	public Cajeros cientificosXID(String dni); //Leer datos de un Cajeros READ

	public Cajeros updateCientificos(Cajeros cajeros); //Actualiza datos del Cajeros UPDATE

	public void deleteCientificos(String dni);// Elimina el Cajeros DELETE

}
