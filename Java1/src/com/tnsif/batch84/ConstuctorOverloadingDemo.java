package com.tnsif.batch84;

public class ConstuctorOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Point p1;
p1=new Point();//default constructor
System.out.println(p1);


p1=new Point(12);//single parameter
System.out.println(p1);

p1=new Point(12.50f,20);
System.out.println(p1);
}
	}
