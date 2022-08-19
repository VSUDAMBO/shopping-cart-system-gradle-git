package com.cg.shoppingcartsystem.orderservice.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.shoppingcartsystem.orderservice.entities.Orders;


public interface OrderRepository extends MongoRepository <Orders, Integer>{

	List<Orders> findAll();

	

	void deleteById(int orderid);

	Orders getOrdersByOrderid(Object orderid);
	
	
	

}
