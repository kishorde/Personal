package com.cybage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cybage.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>
{
	
}
