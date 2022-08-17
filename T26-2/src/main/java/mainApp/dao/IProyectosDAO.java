package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Proyectos;

public interface IProyectosDAO extends JpaRepository<Proyectos, Integer> {

}
