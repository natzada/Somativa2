package com.ex.natzada.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.natzada.entities.TopicoDiscussao;
import com.ex.natzada.repositories.TopicoDiscussaoRepository;

@Service
public class TopicoService {

	@Autowired
	private final TopicoDiscussaoRepository topicoRepository;

	public TopicoService(TopicoDiscussaoRepository topicoRepository) {
		this.topicoRepository = topicoRepository;
	}
	
	public TopicoDiscussao salvarTopico (TopicoDiscussao topico) {
		return topicoRepository.save(topico);
	}
	
	public TopicoDiscussao buscarTopicoPorId (Long Id) {
		Optional<TopicoDiscussao> topico = topicoRepository.findById(Id);
		return topico.orElse(null);
	}
	
	public List<TopicoDiscussao> buscarTopicos () {
		return topicoRepository.findAll();
	}
	
	public List<TopicoDiscussao> buscarPorNomeContendo (String nomeTopico){
		return topicoRepository.findTopicoByNomeContendo(nomeTopico);
	}
	
	public void deletarTopicoById(Long id) {
		topicoRepository.deleteById(id);
	}
}
