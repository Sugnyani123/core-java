package com.tns.staticprog;
//program to demonstrate static variable

public class Employee {
private String name;//instance vatiable
private  int id;
static  String companyName="TNS";
public Employee(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + "]";
}
}
