package com.ecm.web_services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecm.web_services.entities.Order;

/*
 * @Repository is optional because UserRepository extends
 * JpaRepository which is already registered as a Spring @Component! 
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	/*
	 * JpaRepository already has its implementation and there is no
	 * need to implement any methods here!
	 */
}