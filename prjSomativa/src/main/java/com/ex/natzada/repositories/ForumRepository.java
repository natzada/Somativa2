package com.ex.natzada.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.natzada.entities.Forum;

public interface ForumRepository extends JpaRepository<Forum, Long> {

}
