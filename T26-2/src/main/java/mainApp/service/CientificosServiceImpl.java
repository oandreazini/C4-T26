package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.ICientificosDAO;
import mainApp.dto.Cajeros;

@Service
public class CientificosServiceImpl implements ICientificosService{

	// Utilizamos los metodos de la interface ICientificosDAO, es como si instaciaramos.
	@Autowired
	ICientificosDAO iCientificosDAO;

	@Override
	public List<Cajeros> listCientificos() {
		
		return iCientificosDAO.findAll();
	}

	@Override
	public Cajeros saveCientificos(Cajeros cajeros) {
		
		return iCientificosDAO.save(cajeros);
	}

	@Override
	public Cajeros cientificosXID(String dni) {
		
		return iCientificosDAO.findById(dni).get();
	}

	@Override
	public Cajeros updateCientificos(Cajeros cajeros) {
		
		return iCientificosDAO.save(cajeros);
	}

	@Override
	public void deleteCientificos(String dni) {
		iCientificosDAO.deleteById(dni);

	}

}
