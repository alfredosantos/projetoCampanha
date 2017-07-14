package br.com.campanha.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.campanha.dao.Time;
import br.com.campanha.service.TimeService;

@Component
public class TimeBusiness {
	
	@Autowired
	public TimeService service;
	
    public List<Time> listarTime() {
		return service.findAll();
    }

    public Time buscarPorCodigo(int codTime) {
		return service.findOne(codTime);
    }
    
    public Time incluir(Time time) {
		return service.incluir(time);
    }
    
    public void excluir(int codTime) {
    	service.excluir(codTime);
		return;
    }
}
