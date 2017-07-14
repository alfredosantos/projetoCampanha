package br.com.campanha.service;

import java.util.List;

import br.com.campanha.dao.Cliente;

public interface ClienteService {

	List<Cliente> findAll();

	Cliente findOne(int codCliente);
	
	Cliente incluir(Cliente cliente);
	
	void excluir(int codCliente);

}
