package br.com.campanha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.campanha.dao.Campanha;
import br.com.campanha.repository.CampanhaRepository;

@Service
public class CampanhaServiceImpl implements CampanhaService {

	@Autowired
	private CampanhaRepository campanhaRepository;
	
	@Override
	public List<Campanha> findAll() {
		return campanhaRepository.findAll();
	}

	@Override
	public Campanha findOne(int codCampanha) {
		return campanhaRepository.findOne(codCampanha);
	}

	@Override
	public Campanha incluir(Campanha campanha) {
		return campanhaRepository.save(campanha);
	}

	@Override
	public void excluir(int codCampanha) {
		campanhaRepository.delete(codCampanha);
	}

}
