package com.tns.abstraction;

public abstract class Shape {
	abstract void calArea();//Abstract method
	 protected float area;//
	void show()//concrete method or non-abstract method
	{
		System.out.println("The area of shape is "+area);
	}

}
