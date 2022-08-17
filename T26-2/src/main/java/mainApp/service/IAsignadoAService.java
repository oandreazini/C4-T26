package mainApp.service;

import java.util.List;

import mainApp.dto.AsignadoA;

public interface IAsignadoAService {
	
	//Metodos del CRUD
		public List<AsignadoA> listAsignadoA(); //Listar All 

		public AsignadoA saveAsignadoA(AsignadoA asignadoA);	//Guarda un AsignadoA CREATE

		public AsignadoA asignadoAXID(Integer id); //Leer datos de un AsignadoA READ

		public AsignadoA updateAsignadoA(AsignadoA asignadoA); //Actualiza datos del AsignadoA UPDATE

		public void deleteAsignadoA(Integer id);// Elimina el AsignadoA DELETE

}
