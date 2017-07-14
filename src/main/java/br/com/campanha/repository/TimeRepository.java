package br.com.campanha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.campanha.dao.Time;

public interface TimeRepository extends JpaRepository<Time, Integer>{

}
