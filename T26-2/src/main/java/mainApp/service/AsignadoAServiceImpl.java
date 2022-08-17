package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IAsignadoADAO;
import mainApp.dto.AsignadoA;


@Service
public class AsignadoAServiceImpl implements IAsignadoAService{

	// Utilizamos los metodos de la interface IAsignadoADAO, es como si instaciaramos.
	@Autowired
	IAsignadoADAO iAsignadoADAO;
	
	@Override
	public List<AsignadoA> listAsignadoA() {
		
		return iAsignadoADAO.findAll();
	}

	@Override
	public AsignadoA saveAsignadoA(AsignadoA asignadoA) {
	
		return iAsignadoADAO.save(asignadoA);
	}

	@Override
	public AsignadoA asignadoAXID(Integer id) {

		return iAsignadoADAO.findById(id).get();
	}

	@Override
	public AsignadoA updateAsignadoA(AsignadoA asignadoA) {
	
		return iAsignadoADAO.save(asignadoA);
	}

	@Override
	public void deleteAsignadoA(Integer id) {
		iAsignadoADAO.deleteById(id);

	}

}
