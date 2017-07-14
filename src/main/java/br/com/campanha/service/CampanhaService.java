package br.com.campanha.service;

import java.util.List;

import br.com.campanha.dao.Campanha;

public interface CampanhaService {

	List<Campanha> findAll();

	Campanha findOne(int codCampanha);

	Campanha incluir(Campanha campanha);

	void excluir(int codCampanha);

}
