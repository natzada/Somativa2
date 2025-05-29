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

import com.ex.natzada.entities.Forum;
import com.ex.natzada.services.ForumService;

@RestController
@RequestMapping("/forum")
public class ForumController {
	
	@Autowired
	private final ForumService forumService;

	public ForumController(ForumService forumService) {
		this.forumService = forumService;
	}
	
	@PostMapping("/create")
	public Forum createForum(@RequestBody Forum forum) {
		return forumService.salvarForum(forum);
	} 
	
	@GetMapping("/{id}")
	public Forum getForumById(@PathVariable Long id) {
		return forumService.buscarForumPorId(id);
	}
	
	@GetMapping("/list")
	public List<Forum> getAllForums () {
		return forumService.buscarForuns();
	}
	
	@DeleteMapping("/{id}")
	public void deleteForumById (@PathVariable Long id) {
		forumService.deletarForumById(id);
	}
}
