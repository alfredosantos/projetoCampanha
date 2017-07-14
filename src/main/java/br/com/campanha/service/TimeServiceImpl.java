package br.com.campanha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.campanha.dao.Time;
import br.com.campanha.repository.TimeRepository;

@Service
public class TimeServiceImpl implements TimeService {

	@Autowired
	private TimeRepository timeRepository;
	
	@Override
	public List<Time> findAll() {
		return timeRepository.findAll();
	}

	@Override
	public Time findOne(int codTime) {
		return timeRepository.findOne(codTime);
	}

	@Override
	public Time incluir(Time time) {
		return timeRepository.save(time);
	}

	@Override
	public void excluir(int codTime) {
		timeRepository.delete(codTime);
	}

}
