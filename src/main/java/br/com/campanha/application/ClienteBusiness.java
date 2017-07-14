package br.com.campanha.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.campanha.dao.Cliente;
import br.com.campanha.service.ClienteService;

@Component
public class ClienteBusiness {
	
	@Autowired
	public ClienteService service;
	
    public List<Cliente> listarCliente() {
		return service.findAll();
    }

    public Cliente buscarPorCodigo(int codCliente) {
		return service.findOne(codCliente);
    }
    
    public Cliente incluir(Cliente cliente) {
		return service.incluir(cliente);
    }
    
    public void excluir(int codCliente) {
    	service.excluir(codCliente);
		return;
    }
}
