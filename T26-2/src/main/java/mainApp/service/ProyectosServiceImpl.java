package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IProyectosDAO;
import mainApp.dto.Proyectos;


@Service
public class ProyectosServiceImpl implements IProyectosService{
	
	// Utilizamos los metodos de la interface ICientificosDAO, es como si instaciaramos.
	@Autowired
	IProyectosDAO iProyectosDAO;
	
	@Override
	public List<Proyectos> listProyectos() {
		
		return iProyectosDAO.findAll();
	}

	@Override
	public Proyectos saveProyectos(Proyectos proyectos) {
		
		return iProyectosDAO.save(proyectos);
	}

	@Override
	public Proyectos proyectosXID(Integer id) {

		return iProyectosDAO.findById(id).get();
	}

	@Override
	public Proyectos updateProyectos(Proyectos proyectos) {

		return iProyectosDAO.save(proyectos);
	}

	@Override
	public void deleteProyectos(Integer id) {
		iProyectosDAO.deleteById(id);
		
	}
	

}
