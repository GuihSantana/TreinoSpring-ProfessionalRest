package com.endpoint.profissionais.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endpoint.profissionais.entity.Cargo;
import com.endpoint.profissionais.repository.CargoRepository;

@Service

public class CargoService {
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date date = new Date(System.currentTimeMillis());
	String dataAtual = formatter.format(date);
	@Autowired

	private CargoRepository repository;

	public Cargo saveCargo(Cargo cargo) {
		cargo.setDataAtualizacao(dataAtual);
		return repository.save(cargo);
	}


	public List<Cargo> getCargos() {
		return repository.findAll();
	}

	public Cargo getCargoById(int id) {
		return repository.findById(id).orElseThrow(null);
	}

	public String deleteCargo(int id) {
		repository.deleteById(id);
		return "Cargo removido com sucesso!" + id;
	}

	public Cargo updateCargo(Cargo cargo) {
		Cargo cargoExistente = repository.findById(cargo.getId()).orElseThrow(null);
		cargoExistente.setCargoNome(cargo.getCargoNome());
		cargoExistente.setTrilha(cargo.getTrilha());
		cargoExistente.setCargoMissao(cargo.getCargoMissao());
		cargoExistente.setDataAtualizacao(dataAtual);

		return repository.save(cargoExistente);
	}

}
