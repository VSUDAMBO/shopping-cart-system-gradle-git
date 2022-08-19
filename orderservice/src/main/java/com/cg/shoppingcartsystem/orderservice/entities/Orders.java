package com.cg.shoppingcartsystem.orderservice.entities;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Orderdetails")
//@Entity
//@Table(name="orders")
public class Orders {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private  int orderid;
	@Field
	//@Column(name="orderdate",length=20)
	private LocalDate orderDate;
	//@OneToOne
	//@JoinColumn(name="customerid",unique=true)
	private int custemerId;
	//@Column(name = "amountpaid")
	private double ammountPaid;
	//@Column(name="modeofpayment",length=30)
	private  String modeOfPayment;
	//@Column(name="orderstatus",length=20)
	private String orderStatus;
	//@Column(name="quantity",length=20)
	private int quantity;
	
	
	
	
	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", orderDate=" + orderDate + ", custemerId=" + custemerId
				+ ", ammountPaid=" + ammountPaid + ", modeOfPayment=" + modeOfPayment + ", orderStatus=" + orderStatus
				+ ", quantity=" + quantity + "]";
	}
	public Orders() {
		super();
		this.orderid = orderid;
		this.orderDate = orderDate;
		this.custemerId = custemerId;
		this.ammountPaid = ammountPaid;
		this.modeOfPayment = modeOfPayment;
		this.orderStatus = orderStatus;
		this.quantity = quantity;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public int getCustemerId() {
		return custemerId;
	}
	public void setCustemerId(int custemerId) {
		this.custemerId = custemerId;
	}
	public double getAmmountPaid() {
		return ammountPaid;
	}
	public void setAmmountPaid(double ammountPaid) {
		this.ammountPaid = ammountPaid;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
