package com.cg.shoppingcartsystem.orderservice.controller;

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

import com.cg.shoppingcartsystem.orderservice.entities.Orders;
import com.cg.shoppingcartsystem.orderservice.service.OrderServiceImpl;
@RestController
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	OrderServiceImpl orderservice;
	
	@PostMapping("/addOrders")
	public ResponseEntity<String> addOrders(@RequestBody Orders orders){
	  @SuppressWarnings("unused")
		int orderid = orderservice.addOrders(orders);
		return new ResponseEntity<String>("inserted orderscode = "+ orderid,HttpStatus.OK);
		
	}
	@GetMapping("/viewOrders")
	public ResponseEntity<List<Orders>> viewAllOrders(){
		
		List<Orders> orderslist = orderservice.viewAllOrders();
		return new ResponseEntity<List<Orders>>(orderslist,HttpStatus.OK);
		
	}
	@GetMapping("/id/{orderid}")
	public ResponseEntity<Orders> getOrdersById(@PathVariable int order_id){
		Orders orders = orderservice.getOrdersById(order_id);
		return new ResponseEntity <Orders>(orders,HttpStatus.OK);
		
	}
	@DeleteMapping("/id/{orderid}")
	public ResponseEntity<String> deleteOrders(@PathVariable int orderid){
		orderservice.deleteOrders(orderid);
		return new ResponseEntity<String>("deleted",HttpStatus.OK);
		
	}
}
