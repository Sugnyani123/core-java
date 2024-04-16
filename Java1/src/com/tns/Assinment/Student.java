package com.tns.Assinment;

public class Student {
 private String name,address;
 int roll;
public Student(String name, String address, int roll) {
	super();
	this.name = name;
	this.address = address;
	this.roll = roll;
}
@Override
public String toString() {
	return "Student [name=" + name + ", address=" + address + ", roll=" + roll + "]";
}
}