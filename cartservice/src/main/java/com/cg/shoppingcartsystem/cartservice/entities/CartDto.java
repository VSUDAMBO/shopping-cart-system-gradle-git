package com.cg.shoppingcartsystem.cartservice.entities;

public class CartDto {
	private int cartid;
//	private  double totalPrice;
	private String productName;
	private double price;
	private int quantity;
	
	
	public CartDto() {
	
		
	}
	public CartDto(int cartid, String productName, double price, int quantity) {
		
		this.cartid = cartid;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "CartDto [cartid=" + cartid + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
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
