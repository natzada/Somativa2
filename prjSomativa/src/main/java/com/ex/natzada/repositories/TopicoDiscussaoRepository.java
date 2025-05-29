package com.ex.natzada.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ex.natzada.entities.TopicoDiscussao;

public interface TopicoDiscussaoRepository extends JpaRepository<TopicoDiscussao, Long>{
	
	@Query("SELECT t FROM TopicoDiscussao t WHERE LOWER(t.topico_title) LIKE LOWER(CONCAT('%', :topico_title, '%'))")
	List<TopicoDiscussao> findTopicoByNomeContendo(@Param("topico_title") String topico_title);
}
