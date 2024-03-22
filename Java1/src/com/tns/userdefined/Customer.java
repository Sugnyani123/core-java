package com.tns.userdefined;

public class Customer {
private String cusomerName;
private int customer;
private String city;
public String getCusomerName() {
	return cusomerName;
}
public void setCusomerName(String cusomerName) {
	this.cusomerName = cusomerName;
}
public int getCustomer() {
	return customer;
}
public void setCustomer(int customer) {
	this.customer = customer;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Customer [cusomerName=" + cusomerName + ", customer=" + customer + "]";
}
}
