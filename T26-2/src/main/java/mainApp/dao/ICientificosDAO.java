package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Cientificos;

public interface ICientificosDAO extends JpaRepository<Cientificos, String> {

}
