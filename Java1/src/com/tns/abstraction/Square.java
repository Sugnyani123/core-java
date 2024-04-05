package com.tns.abstraction;

public class Square extends Shape  {
	private float side;
	public Square()
	{
		super();
		side=0.2f;
		
	}
	
	
	public Square(float side) {
		super();
		this.side = side;
	}
void calArea()
{
	area = side*side;
}



	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}}
