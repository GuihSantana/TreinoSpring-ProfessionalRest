package com.endpoint.profissionais.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endpoint.profissionais.entity.Trilha;
import com.endpoint.profissionais.repository.TrilhaRepository;

@Service
public class TrilhaService {
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date date = new Date(System.currentTimeMillis());
	String dataAtual = formatter.format(date);

	@Autowired
	private TrilhaRepository repository;

	public Trilha saveTrilha(Trilha trilha) {
		trilha.setDataAtualizacao(dataAtual);
		return repository.save(trilha);
	}

	public List<Trilha> getTrilhas() {
		return repository.findAll();
	}

	public Trilha getTrilhaById(int id) {
		return repository.findById(id).orElseThrow(null);
	}
	public String deleteTrilha(int id) {
		repository.deleteById(id);
		return "Trilha removida com sucesso!"+ id;
	}
	
	public Trilha updateTrilha(Trilha trilha) {
		Trilha trilhaExistente = repository.findById(trilha.getId()).orElseThrow(null);
		trilhaExistente.setTrilhaNome(trilha.getTrilhaNome());
		trilhaExistente.setDiretoria(trilha.getDiretoria());
		trilhaExistente.setMissaoFormal(trilha.getMissaoFormal());
		trilhaExistente.setMissaoAlternativa(trilha.getMissaoAlternativa());
		trilhaExistente.setDataAtualizacao(dataAtual);
		return repository.save(trilhaExistente);
	}
}
