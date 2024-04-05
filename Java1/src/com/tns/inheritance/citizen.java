package com.tns.inheritance;
//Base class
public class citizen {
private String name;
private long adharNo;
private String address;
private long phno;


//default constructor

public citizen() {
	
}

//parametarised constructor
public citizen(String name, long adharNo, String address, long phno) {
	
	this.name = name;
	this.adharNo = adharNo;
	this.address = address;
	this.phno = phno;
}





public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public long getAdharNo() {
	return adharNo;
}


public void setAdharNo(long adharNo) {
	this.adharNo = adharNo;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public long getPhno() {
	return phno;
}


public void setPhno(long phno) {
	this.phno = phno;
}
@Override///annotation
public String toString() {
	return "citizen [name=" + name + ", adharNo=" + adharNo + ", address=" + address + ", phno=" + phno + "]";
}



}
