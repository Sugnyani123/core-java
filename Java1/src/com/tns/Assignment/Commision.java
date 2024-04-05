package com.tns.Assignment;

import java.util.Scanner;

public class Commision 
{
private String name;
private String address;
private long phone;
private double sales_Amount;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public double getSales_Amount() {
	return sales_Amount;
}
public void setSales_Amount(double sales_Amount) {
	this.sales_Amount = sales_Amount;
}
public double calculateCommision()

{
double commision;
if(sales_Amount>=100000)
{
	commision=sales_Amount*10/100;
}
else if(sales_Amount>=50000  && sales_Amount<100000)
{
	commision=sales_Amount*5/100;
}
else if(sales_Amount>=30000 &&sales_Amount<50000)
{
commision=sales_Amount*3/100;
}
else
{
	commision=0;
}
return commision;
}}
