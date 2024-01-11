package com.ecm.web_services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecm.web_services.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}