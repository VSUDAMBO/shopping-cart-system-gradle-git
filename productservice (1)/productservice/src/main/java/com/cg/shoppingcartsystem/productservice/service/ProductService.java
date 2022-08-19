package com.cg.shoppingcartsystem.productservice.service;

import java.util.List;

import com.cg.shoppingcartsystem.productservice.entities.Product;

public interface ProductService {

	int addProduct(Product product);

	List<Product> viewAllProduct();

	Product getProductByProductId(int productid);

	void deleteProduct(int productid);

	
	
	

	
	

	
	

}
