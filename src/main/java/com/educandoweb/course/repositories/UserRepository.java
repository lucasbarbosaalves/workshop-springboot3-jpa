package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

// Gera uma implementação padrão do JPA Repository, sem necessidade de implementar
public interface UserRepository extends JpaRepository<User, Long>{
	
}
