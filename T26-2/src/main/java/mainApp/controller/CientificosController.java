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

import mainApp.dto.Cientificos;
import mainApp.service.CientificosServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificosController {
	
	@Autowired
	CientificosServiceImpl cientificosServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientificos> listCientificos() {
		return cientificosServiceImpl.listCientificos();
	}

	@PostMapping("/cientificos")
	public Cientificos saveCientificos(@RequestBody Cientificos cientificos) {

		return cientificosServiceImpl.saveCientificos(cientificos);
	}

	@GetMapping("/cientificos/{dni}")
	public Cientificos cientificosXID(@PathVariable(name = "dni") String dni) {
	
		return cientificosServiceImpl.cientificosXID(dni);

	}

	@PutMapping("/cientificos/{dni}")
	public Cientificos updateCientificos(@PathVariable(name = "dni") String dni, @RequestBody Cientificos cientificos) {

		Cientificos cientificos_select;
		Cientificos cientificos_update;

		cientificos_select = cientificosServiceImpl.cientificosXID(dni);
		
		cientificos_select.setDni(cientificos.getDni());
		cientificos_select.setNombre_apellidos(cientificos.getNombre_apellidos());
		cientificos_select.setAsignadoA(cientificos.getAsignadoA());
		
		cientificos_update = cientificosServiceImpl.updateCientificos(cientificos_select);

		System.out.println("El cientificos actualizado es: " + cientificos_update);

		return cientificos_update;
	}

	@DeleteMapping("/cientificos/{dni}")
	public void deleteCientificos(@PathVariable(name = "dni") String dni) {
		cientificosServiceImpl.deleteCientificos(dni);
	}


}
