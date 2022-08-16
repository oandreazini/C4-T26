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

import mainApp.dto.Proyectos;
import mainApp.service.ProyectosServiceImpl;

@RestController
@RequestMapping("/api")
public class ProyectosController {

	@Autowired
	ProyectosServiceImpl proyectosServiceImpl;

	@GetMapping("/proyectos")
	public List<Proyectos> listProyectos() {
		return proyectosServiceImpl.listProyectos();
	}

	@PostMapping("/proyectos")
	public Proyectos saveProyectos(@RequestBody Proyectos proyectos) {

		return proyectosServiceImpl.saveProyectos(proyectos);
	}

	@GetMapping("/proyectos/{id}")
	public Proyectos proyectosXID(@PathVariable(name = "id") Integer id) {

		return proyectosServiceImpl.proyectosXID(id);

	}

	@PutMapping("/proyectos/{id}")
	public Proyectos updateProyectos(@PathVariable(name = "id") Integer id, @RequestBody Proyectos proyectos) {

		Proyectos proyectos_select;
		Proyectos proyectos_update;

		proyectos_select = proyectosServiceImpl.proyectosXID(id);
		
		proyectos_select.setNombre(proyectos.getNombre());
		proyectos_select.setHoras(proyectos.getHoras());
		proyectos_select.setAsignadoA(proyectos.getAsignadoA());
		
		proyectos_update = proyectosServiceImpl.updateProyectos(proyectos_select);

		System.out.println("El proyectos actualizado es: " + proyectos_update);

		return proyectos_update;
	}

	@DeleteMapping("/proyectos/{id}")
	public void deleteProyectos(@PathVariable(name = "id") Integer id) {
		proyectosServiceImpl.deleteProyectos(id);
	}

}
