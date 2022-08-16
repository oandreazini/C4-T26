package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Cajeros;

public interface ICientificosDAO extends JpaRepository<Cajeros, String> {

}
