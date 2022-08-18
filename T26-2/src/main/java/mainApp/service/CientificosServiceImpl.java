package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.ICientificosDAO;
import mainApp.dto.Cientificos;

@Service
public class CientificosServiceImpl implements ICientificosService{

	// Utilizamos los metodos de la interface ICientificosDAO, es como si instaciaramos.
	@Autowired
	ICientificosDAO iCientificosDAO;

	@Override
	public List<Cientificos> listCientificos() {
		
		return iCientificosDAO.findAll();
	}

	@Override
	public Cientificos saveCientificos(Cientificos cientificos) {
		
		return iCientificosDAO.save(cientificos);
	}

	@Override
	public Cientificos cientificosXID(String dni) {
		
		return iCientificosDAO.findById(dni).get();
	}

	@Override
	public Cientificos updateCientificos(Cientificos cientificos) {
		
		return iCientificosDAO.save(cientificos);
	}

	@Override
	public void deleteCientificos(String dni) {
		iCientificosDAO.deleteById(dni);

	}

}
