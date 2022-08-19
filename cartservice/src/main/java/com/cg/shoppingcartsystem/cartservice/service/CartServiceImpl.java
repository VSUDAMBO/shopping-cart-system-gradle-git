package com.cg.shoppingcartsystem.cartservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.shoppingcartsystem.cartservice.entities.Cart;
import com.cg.shoppingcartsystem.cartservice.entities.CartDto;
import com.cg.shoppingcartsystem.cartservice.entities.Items;
import com.cg.shoppingcartsystem.cartservice.repositories.CartRepository;


@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	CartRepository cartrepo;

	public int addToCart(CartDto cartdto) {
		Cart cart = new Cart();
		cart.setCartid(cartdto.getCartid());
		cartdto.setProductName(cartdto.getProductName());
		cartdto.setPrice(cartdto.getPrice());
		cartdto.setQuantity(cartdto.getQuantity());
		//cart.setItem_description(cartdto.getItem_description());
		cartrepo.save(cart);
		return cart.getCartid();
		
	}

	public List<CartDto> viewAllCart() {
		Iterable<Cart> cartlist= cartrepo.findAll();
		ArrayList<CartDto> cartdtolist =new ArrayList<CartDto>();
		for(Cart cart : cartlist) {
			CartDto cartdto = new CartDto();
	cartdto.setProductName(cartdto.getProductName());
		cartdto.setPrice(cartdto.getPrice());
			cartdto.setQuantity(cartdto.getQuantity());
			//cartdto.setItem_description(cart.getItem_description());
			cartdtolist.add(cartdto);

		}
		
		return cartdtolist;
	}
	

	public void deleteCart(int cartid) {
		cartrepo.deleteById(cartid);

		
		
	}

}
