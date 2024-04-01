package com.tns.abstraction;

public class Rectangle extends Shape 
{
private float length=0.3f;
private float bredth=0.5f;


public Rectangle() {
	super();
}


public Rectangle(float length, float bredth) {
	super();
	this.length = length;
	this.bredth = bredth;
}
void calArea()
{
	area =length*bredth;
}

@Override
public String toString() {
	return "Rectangle [length=" + length + ", bredth=" + bredth + "]";
}


}
