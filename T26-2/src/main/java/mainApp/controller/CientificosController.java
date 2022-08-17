package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mainApp.dto.Cajeros;
import mainApp.service.CientificosServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificosController {
	
	@Autowired
	CientificosServiceImpl cientificosServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cajeros> listCientificos() {
		return cientificosServiceImpl.listCientificos();
	}

	@PostMapping("/cientificos")
	public Cajeros saveCientificos(@RequestBody Cajeros cajeros) {

		return cientificosServiceImpl.saveCientificos(cajeros);
	}

	@GetMapping("/cientificos/{dni}")
	public Cajeros cientificosXID(@PathVariable(name = "dni") String dni) {
	
		return cientificosServiceImpl.cientificosXID(dni);

	}

	@PutMapping("/cientificos/{dni}")
	public Cajeros updateCientificos(@PathVariable(name = "dni") String dni, @RequestBody Cajeros cajeros) {

		Cajeros cientificos_select;
		Cajeros cientificos_update;

		cientificos_select = cientificosServiceImpl.cientificosXID(dni);
		
		cientificos_select.setDni(cajeros.getDni());
		cientificos_select.setNombre_apellidos(cajeros.getNombre_apellidos());
		cientificos_select.setAsignadoA(cajeros.getAsignadoA());
		
		cientificos_update = cientificosServiceImpl.updateCientificos(cientificos_select);

		System.out.println("El cientificos actualizado es: " + cientificos_update);

		return cientificos_update;
	}

	@DeleteMapping("/cientificos/{dni}")
	public void deleteCientificos(@PathVariable(name = "dni") String dni) {
		cientificosServiceImpl.deleteCientificos(dni);
	}


}
