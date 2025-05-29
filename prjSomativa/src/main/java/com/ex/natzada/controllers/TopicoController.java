package com.ex.natzada.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex.natzada.entities.TopicoDiscussao;
import com.ex.natzada.services.TopicoService;

@RestController
@RequestMapping("/topico")
public class TopicoController {
	
	@Autowired
	private final TopicoService topicoService;

	public TopicoController(TopicoService topicoService) {
		this.topicoService = topicoService;
	}
	
	@PostMapping("/create")
	public TopicoDiscussao createTopico (@RequestBody TopicoDiscussao topico) {
		return topicoService.salvarTopico(topico);
	}
	
	@GetMapping("/{id}")
	public TopicoDiscussao getTopicoById (@PathVariable Long id) {
		return topicoService.buscarTopicoPorId(id);
	}
	
	@GetMapping("/list")
	public List<TopicoDiscussao> getAllTopicos () {
		return topicoService.buscarTopicos();
	}
	
	@GetMapping("/name/{topico_title}")
	public List<TopicoDiscussao> getTopicoByName(@PathVariable String topico_title){
		return topicoService.buscarPorNomeContendo(topico_title);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTopicoById (@PathVariable Long id) {
		topicoService.deletarTopicoById(id);
	}
	
}
