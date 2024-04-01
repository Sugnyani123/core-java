package com.tns.Assignment;

public class Circle {
private static final String calcArea = null;
private double radius;
private String color;
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
private double cakcArea() {
	return Math.PI*radius*radius;}


public static void main(String args[])
{
	Circle circle=new Circle();
	circle.setRadius(5);
	//Example radius value;
	circle.setRadius(5);
	//Example color value ;
	System.out.println("Area od circle" +circle.calcArea);
}}