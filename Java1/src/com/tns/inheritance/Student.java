package com.tns.inheritance;

public class Student extends citizen
{
private int rollNo;
private String collegeName;

public Student() {
	super();
}


public Student(String Name,long adharNo,String address,long phNo) {
	super(Name,adharNo,address,phNo);
	

	this.rollNo=rollNo;
	this.collegeName=collegeName;
	}

public int getRollNo() {
	return rollNo;
}


public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}


public String getCollageName() {
	return collegeName;
}


public void setCollageName(String collegeName) {
	this.collegeName = collegeName;
}


@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getRollNo()=" + getRollNo()
			+ ", getCollageName()=" + getCollageName() + ", getName()=" + getName() + ", getAdharNo()=" + getAdharNo()
			+ ", getAddress()=" + getAddress() + ", getPhno()=" + getPhno() + ", toString()=" + super.toString()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}


}




