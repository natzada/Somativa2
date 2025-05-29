package com.ex.natzada.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_topico")
public class TopicoDiscussao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long topico_id;
	
	private String topico_title;
	private String mensagemInicial;
	private String autor;
	private String topico_data;
	
	@ManyToOne
	@JoinColumn(name="forum_id")
	private Forum forum;

	public TopicoDiscussao() {
	}

	public TopicoDiscussao(Long topico_id, String topico_title, String mensagemInicial, String autor,
			String topico_data, Forum forum) {
		this.topico_id = topico_id;
		this.topico_title = topico_title;
		this.mensagemInicial = mensagemInicial;
		this.autor = autor;
		this.topico_data = topico_data;
		this.forum = forum;
	}

	public Long getTopico_id() {
		return topico_id;
	}

	public void setTopico_id(Long topico_id) {
		this.topico_id = topico_id;
	}

	public String getTopico_title() {
		return topico_title;
	}

	public void setTopico_title(String topico_title) {
		this.topico_title = topico_title;
	}

	public String getMensagemInicial() {
		return mensagemInicial;
	}

	public void setMensagemInicial(String mensagemInicial) {
		this.mensagemInicial = mensagemInicial;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTopico_data() {
		return topico_data;
	}

	public void setTopico_data(String topico_data) {
		this.topico_data = topico_data;
	}

	public Forum getForum() {
		return forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}
	
	
	
}
