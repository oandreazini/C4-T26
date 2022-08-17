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

import mainApp.dto.AsignadoA;
import mainApp.service.AsignadoAServiceImpl;


@RestController
@RequestMapping("/api")
public class AsignadoAController {

	@Autowired
	AsignadoAServiceImpl asignadoAServiceImpl;

	@GetMapping("/asignadoa")
	public List<AsignadoA> listAsignadoA() {
		return asignadoAServiceImpl.listAsignadoA();
	}

	@PostMapping("/asignadoa")
	public AsignadoA saveAsignadoA(@RequestBody AsignadoA asignadoa) {

		return asignadoAServiceImpl.saveAsignadoA(asignadoa);
	}

	@GetMapping("/asignadoa/{dni}")
	public AsignadoA asignadoAXID(@PathVariable(name = "id") Integer id) {

		return asignadoAServiceImpl.asignadoAXID(id);

	}

	@PutMapping("/asignadoa/{id}")
	public AsignadoA updateAsignadoA(@PathVariable(name = "id") Integer id, @RequestBody AsignadoA asignadoa) {

		AsignadoA asignadoa_select;
		AsignadoA asignadoa_update;

		asignadoa_select = asignadoAServiceImpl.asignadoAXID(id);

		asignadoa_select.setCientificos(asignadoa.getCientificos());
		asignadoa_select.setProyectos(asignadoa.getProyectos());
		
		asignadoa_update = asignadoAServiceImpl.updateAsignadoA(asignadoa_select);

		System.out.println("El asignadoa actualizado es: " + asignadoa_update);

		return asignadoa_update;
	}

	@DeleteMapping("/asignadoa/{id}")
	public void deleteAsignadoA(@PathVariable(name = "id") Integer id) {
		asignadoAServiceImpl.deleteAsignadoA(id);
	}


}
