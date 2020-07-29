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

import com.endpoint.profissionais.entity.Trilha;
import com.endpoint.profissionais.service.TrilhaService;

@RestController
public class TrilhaController {
	
	@Autowired
	private TrilhaService service;
	
	@PostMapping("profissional/trilha/addTrilha")
	public Trilha addTrilha(@RequestBody Trilha trilha) {
		return service.saveTrilha(trilha);
	}
	@GetMapping("profissional/trilhas")
	public List<Trilha> listarTrilhas(){
		return service.getTrilhas();
	}
	@GetMapping("profissional/trilha/{id}")
	public Trilha listarTrilhaById(@PathVariable int id){
		return service.getTrilhaById(id);
	}
	@PutMapping("profissional/trilha/update")
	public Trilha updateTrilha(@RequestBody Trilha trilha) {
		return service.updateTrilha(trilha);
	}
	
	@DeleteMapping("profissional/trilha/delete/{id}")
	public String deleteTrilha(@PathVariable int id) {
		return service.deleteTrilha(id);
	}
}
