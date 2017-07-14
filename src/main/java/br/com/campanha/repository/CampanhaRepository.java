package br.com.campanha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.campanha.dao.Campanha;

public interface CampanhaRepository extends JpaRepository<Campanha, Integer>{

}
