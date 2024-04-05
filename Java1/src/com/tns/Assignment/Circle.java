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
double calculateArea() {
	return Math.PI*radius*radius;}

}