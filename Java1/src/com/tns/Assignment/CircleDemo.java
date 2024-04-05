package com.tns.Assignment;
import java.util.*;
public class CircleDemo 
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		System.out.println("Eneter the radius of circle");
		
		double r=sc.nextDouble();
		c.setRadius(r);
		System.out.println("The radius of circle is:" +c.calculateArea() );
	
}
	}