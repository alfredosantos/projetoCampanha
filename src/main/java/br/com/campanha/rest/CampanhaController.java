package br.com.campanha.rest;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.campanha.application.CampanhaBusiness;
import br.com.campanha.dao.Campanha;

@Controller
@RestController
@RequestMapping("campanha")
public class CampanhaController {
	public static final String JSON = "application/json";

	@Autowired
	private CampanhaBusiness business;

	@RequestMapping(
            value = "/buscarTodos",
            method = RequestMethod.GET,
            produces = { JSON }
    )
    public List<Campanha> buscarTodos() throws IOException {
        return business.listarCampanha();
    }
	
	@RequestMapping(
            value = "/buscarPorCodigo",
            method = RequestMethod.GET,
            produces = { JSON }
    )
    public Campanha buscarPorCodigo(int codCampanha) throws IOException {
        return business.buscarPorCodigo(codCampanha);
    }
	
	@RequestMapping(
            value = "/incluir",
            method = RequestMethod.POST,
            produces = { JSON }
    )
    public Campanha incluir(@RequestBody Campanha Campanha) throws IOException {
        return business.incluir(Campanha);
    }
	
	@RequestMapping(
            value = "/excluir",
            method = RequestMethod.POST,
            produces = { JSON }
    )
    public void excluir(int codCampanha) throws IOException {
		business.excluir(codCampanha);
        return; 
    }
}
