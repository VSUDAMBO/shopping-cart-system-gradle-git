package com.cg.shoppingcartsystem.orderservice.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {
	
	
	//@Column(name="fullname",length=30)
	private String fullName;
	//@Column(name="mobilenumber")
	private String mobileNumber;
	private int flatNumber;
	//@Column(name="city",length=20)
	private String city;
	//@Column(name="pincode")
	private int pincode;
	//@Column(name="state",length=20)
	private String state;
	//@OneToOne
	//@JoinColumn(name="customer_id",unique=true)
	@Id
	private  int customerId;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address(int customerId, String fullName, String mobileNumber, int flatNumber, String city, int pincode,
			String state) {
		super();
		this.customerId = customerId;
		this.fullName = fullName;
		this.mobileNumber = mobileNumber;
		this.flatNumber = flatNumber;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [customerId=" + customerId + ", fullName=" + fullName + ", mobileNumber=" + mobileNumber
				+ ", flatNumber=" + flatNumber + ", city=" + city + ", pincode=" + pincode + ", state=" + state + "]";
	}
	
		
	

}
