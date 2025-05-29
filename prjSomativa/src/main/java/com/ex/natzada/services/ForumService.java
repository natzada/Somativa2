package com.ex.natzada.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.natzada.entities.Forum;
import com.ex.natzada.repositories.ForumRepository;

@Service
public class ForumService {

		@Autowired
		private final ForumRepository forumRepository;

		public ForumService(ForumRepository forumRepository) {
			this.forumRepository = forumRepository;
		}
		
		public Forum salvarForum (Forum forum) {
			return forumRepository.save(forum);
		}
		
		public Forum buscarForumPorId (Long id) {
			Optional<Forum> forum = forumRepository.findById(id);
			return forum.orElse(null);
		}
		
		public List<Forum> buscarForuns () {
			return forumRepository.findAll();
		}
		
		public void deletarForumById (Long id) {
			forumRepository.deleteById(id);
		}
}
