package com.cg.shoppingcartsystem.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.shoppingcartsystem.productservice.entities.Product;
import com.cg.shoppingcartsystem.productservice.service.ProductService;







@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productservice;
	
	
	@PostMapping("/addProduct")
	public ResponseEntity<String> addProduct(@RequestBody Product product){
     int productid = productservice.addProduct(product);
		
		return new ResponseEntity<String>("inserted orderscode = ",HttpStatus.OK);
		
	}
	@GetMapping("/viewAllIProduct")
	public ResponseEntity<List<Product>> getAllProduct(){
		List<Product> productlist = productservice.viewAllProduct();
		return new ResponseEntity<List<Product>>(productlist,HttpStatus.OK);
		
	}
	@GetMapping("/Product/{Productid}")
	public ResponseEntity<Product> getProductById(@PathVariable int Productid){
		Product Productdetails = productservice.getProductByProductId(Productid);
		return new ResponseEntity<Product>(Productdetails,HttpStatus.OK);
	}

	@DeleteMapping("/delete/{Productid}")
	public ResponseEntity<String> deleteDepartment(@PathVariable int Productid){
		productservice.deleteProduct(Productid);
		return new ResponseEntity<String>("deleted",HttpStatus.OK);
	}
}
