package com.endpoint.profissionais.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.endpoint.profissionais.entity.Cargo;
import com.endpoint.profissionais.service.CargoService;

@RestController
public class CargoController {

	@Autowired
	private CargoService service;

	@PostMapping("profissional/cargo/addCargo")
	public Cargo addCargo(@RequestBody Cargo cargo) {

		return service.saveCargo(cargo);
	}

	@GetMapping("profissional/cargos")
	public List<Cargo> listarCargos() {
		return service.getCargos();
	}

	@GetMapping("profissional/cargo/{id}")
	public Cargo listaCargoById(@PathVariable int id) {
		return service.getCargoById(id);
	}

	@PutMapping("profissional/cargo/update")
	public Cargo updateCargo(@RequestBody Cargo cargo) {
		return service.updateCargo(cargo);
	}
	
	@DeleteMapping("profissional/cargo/delete/{id}")
	public String deleteCargo(@PathVariable int id) {
		return service.deleteCargo(id);
	}
}
