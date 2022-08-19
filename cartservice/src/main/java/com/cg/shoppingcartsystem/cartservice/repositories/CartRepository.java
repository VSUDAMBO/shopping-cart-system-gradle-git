package com.cg.shoppingcartsystem.cartservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.shoppingcartsystem.cartservice.entities.Cart;

public interface CartRepository extends MongoRepository<Cart,Integer>{

	

	void deleteById(int cartid);
	
	
	

}
