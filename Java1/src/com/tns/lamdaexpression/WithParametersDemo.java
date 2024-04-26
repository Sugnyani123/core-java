package com.tns.lamdaexpression;

public class WithParametersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cube c=(a)->{return (a*a*a);};
System.out.println("Cube of a number is"+c.calculate(5));
	
	Square s=(x)->{return (x*x);};
	System.out.println("Square of a number is"+s.calculate(5));
	}

}
