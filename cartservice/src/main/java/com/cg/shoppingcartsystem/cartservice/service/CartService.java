package com.cg.shoppingcartsystem.cartservice.service;

import java.util.List;

import com.cg.shoppingcartsystem.cartservice.entities.CartDto;

public interface CartService {
	int addToCart(CartDto cartdto);
	List<CartDto> viewAllCart();
	void deleteCart(int cartid);
}
