package com.ecm.web_services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecm.web_services.entities.Category;

/*
 * @Repository is optional because CategoryRepository extends
 * JpaRepository which is already registered as a Spring @Component! 
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	/*
	 * JpaRepository already has its implementation and there is no
	 * need to implement any methods here!
	 */
}