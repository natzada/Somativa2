package com.ex.natzada.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_forum")
public class Forum {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long forum_id;
	
	private String forum_description;
	private String forum_title;
	private String forum_date;
	
	@OneToMany(mappedBy = "forum")
	private List<TopicoDiscussao> topicos;
	
	public Forum() {
	}

	public Forum(Long id, String description, String title, String date, List<TopicoDiscussao> topicos) {
		this.forum_id = id;
		this.forum_description = description;
		this.forum_title = title;
		this.forum_date = date;
		this.topicos = topicos;
	}

	public Long getId() {
		return forum_id;
	}

	public void setId(Long id) {
		this.forum_id = id;
	}

	public String getDescription() {
		return forum_description;
	}

	public void setDescription(String description) {
		this.forum_description = description;
	}

	public String getTitle() {
		return forum_title;
	}

	public void setTitle(String title) {
		this.forum_title = title;
	}

	public String getDate() {
		return forum_date;
	}

	public void setDate(String date) {
		this.forum_date = date;
	}

	public List<TopicoDiscussao> getTopico() {
		return topicos;
	}

	public void setTopico(List<TopicoDiscussao> topicos) {
		this.topicos = topicos;
	}
	
	
	
	
}
