package br.com.campanha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.campanha.dao.Cliente;
import br.com.campanha.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}
	
	@Override
	public Cliente findOne(int codCliente) {
		return clienteRepository.findOne(codCliente);
	}

	@Override
	public Cliente incluir(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public void excluir(int codCliente) {
		clienteRepository.delete(codCliente);
		return;
	}

}
