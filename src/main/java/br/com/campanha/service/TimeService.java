package br.com.campanha.service;

import java.util.List;

import br.com.campanha.dao.Time;

public interface TimeService {

	List<Time> findAll();

	Time findOne(int codTime);

	Time incluir(Time time);

	void excluir(int codTime);

}
