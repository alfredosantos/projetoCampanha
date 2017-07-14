package br.com.campanha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.campanha.dao.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
