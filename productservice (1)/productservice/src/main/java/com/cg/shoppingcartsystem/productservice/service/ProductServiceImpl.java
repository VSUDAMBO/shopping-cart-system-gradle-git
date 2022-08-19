package com.cg.shoppingcartsystem.productservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.shoppingcartsystem.productservice.entities.Product;
import com.cg.shoppingcartsystem.productservice.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	ProductRepository productrepo;
	
	
	@Override
	public int addProduct(Product product) {
		Product products = new Product();
		products.setDescription(products.getDescription());
	    products.setPrice(products.getPrice());
	    productrepo.save(product);
		return product.getProductId();
		
	}

	@Override
	public List<Product> viewAllProduct() {
		List<Product> productlist= productrepo.findAll();
		ArrayList<Product> productlist1 =new ArrayList<Product>();
		for(Product product : productlist1) {
			Product products = new Product();
			products.setProductId(products.getProductId());
			products .setDescription(products .getDescription());
			products .setProductName(products .getProductName());
			products .setPrice(products .getPrice());
			//itemdto.setVendor_id(item.getVendor().getVendor_id());
		
			productlist.add(products);

		}
		
		return productlist;
		
	}

	@Override
	public Product getProductByProductId(int productid) {
		Product product = productrepo.getProductByProductId(productid);
	if(product == null)
		throw new ProductNotFoundException();
		Product products = new Product();
	products.setProductName(products.getProductName());
		product.setDescription(product.getDescription());
		product.setPrice(product.getPrice());
		//itemdto.setVendor_id(item.getVendor().getVendor_id());
		
		
		return product;
		
	}

	@Override
	public void deleteProduct(int productid) {
		
		productrepo.deleteById(productid);
	}

}
