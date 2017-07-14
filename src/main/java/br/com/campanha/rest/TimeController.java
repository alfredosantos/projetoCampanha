package br.com.campanha.rest;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.campanha.application.TimeBusiness;
import br.com.campanha.dao.Time;

@Controller
@RestController
@RequestMapping("time")
public class TimeController {
	public static final String JSON = "application/json";

	@Autowired
	private TimeBusiness business;

	@RequestMapping(
            value = "/buscarTodos",
            method = RequestMethod.GET,
            produces = { JSON }
    )
    public List<Time> buscarTodos() throws IOException {
        return business.listarTime();
    }
	
	@RequestMapping(
            value = "/buscarPorCodigo",
            method = RequestMethod.GET,
            produces = { JSON }
    )
    public Time buscarPorCodigo(int codTime) throws IOException {
        return business.buscarPorCodigo(codTime);
    }
	
	@RequestMapping(
            value = "/incluir",
            method = RequestMethod.POST,
            produces = { JSON }
    )
    public Time incluir(@RequestBody Time Time) throws IOException {
        return business.incluir(Time);
    }
	
	@RequestMapping(
            value = "/excluir",
            method = RequestMethod.POST,
            produces = { JSON }
    )
    public void excluir(int codTime) throws IOException {
		business.excluir(codTime);
        return; 
    }
}
