package com.tnsif.batch84;

public class Point {
	float x,y;

	public Point() //Default constructor
	{
		this.x=0.0f;
		this.y=0.0f;
		
	}

	public Point(float value)//parameterized condtuctor
	{
		
		this.x = value;
		this.y = value;
	}
	
	public Point(float x,float y)//parameterized condtuctor
	{
		
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
