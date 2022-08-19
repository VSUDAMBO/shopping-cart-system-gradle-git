package com.cg.shoppingcartsystem.orderservice.entities;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document(collection="Orderdetails")
//@Entity
//@Table(name="Item")
public class Items {
	
//@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
   // @Column(name="productName",length=20)
	@Field
	private String productName;
	//@Column(name="price")
	private double price;
	//@Column(name="quantity",length=20)
	private int quantity;
	
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
