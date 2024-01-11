package com.ecm.web_services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecm.web_services.entities.User;

/*
 * @Repository is optional because UserRepository extends
 * JpaRepository which is already registered as a Spring @Component! 
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}