package br.com.campanha.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.campanha.dao.Campanha;
import br.com.campanha.service.CampanhaService;

@Component
public class CampanhaBusiness {
	
	@Autowired
	public CampanhaService service;
	
    public List<Campanha> listarCampanha() {
		return service.findAll();
    }

    public Campanha buscarPorCodigo(int codCampanha) {
		return service.findOne(codCampanha);
    }
    
    public Campanha incluir(Campanha Campanha) {
		return service.incluir(Campanha);
    }
    
    public void excluir(int codCampanha) {
    	service.excluir(codCampanha);
		return;
    }

}
