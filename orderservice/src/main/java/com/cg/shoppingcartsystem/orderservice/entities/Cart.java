package com.cg.shoppingcartsystem.orderservice.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Cart")
//@Entity
//@Table(name="cart")
public class Cart {
	

	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
private int cartid;
	//@Column(name="totalprice")
private  double totalPrice;
	private int quantity;
	
	
@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", totalPrice=" + totalPrice + ", quantity=" + quantity + "]";
	}
public Cart(int quantity,int cartid,double totalprice) {
	
	
	this.quantity=quantity;
	this.cartid = cartid;
	this.totalPrice = totalPrice;
}
public Cart() {
	
	// TODO Auto-generated constructor stub
}
public int getCartid() {
	return cartid;
}
public void setCartid(int cartid) {
	this.cartid = cartid;
}
public double getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}
public void setQuantity(int quantity) {
this.quantity=quantity;

}
public int getQuantity() {
	
return quantity;
}



}
