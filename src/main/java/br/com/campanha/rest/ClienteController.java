package br.com.campanha.rest;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.campanha.application.ClienteBusiness;
import br.com.campanha.dao.Cliente;

@Controller
@RestController
@RequestMapping("cliente")
public class ClienteController {
	public static final String JSON = "application/json";
	
	@Autowired
	private ClienteBusiness business;

	@RequestMapping(
            value = "/buscarTodos",
            method = RequestMethod.GET,
            produces = { JSON }
    )
    public List<Cliente> buscarTodos() throws IOException {
        return business.listarCliente();
    }
	
	@RequestMapping(
            value = "/buscarPorCodigo",
            method = RequestMethod.GET,
            produces = { JSON }
    )
    public Cliente buscarPorCodigo(int codCliente) throws IOException {
        return business.buscarPorCodigo(codCliente);
    }
	
	@RequestMapping(
            value = "/incluir",
            method = RequestMethod.POST,
            produces = { JSON }
    )
    public Cliente incluir(@RequestBody Cliente cliente) throws IOException {
        return business.incluir(cliente);
    }
	
	@RequestMapping(
            value = "/excluir",
            method = RequestMethod.POST,
            produces = { JSON }
    )
    public void excluir(int codCliente) throws IOException {
		business.excluir(codCliente);
        return; 
    }

}
