package com.tns.exception;

public class Throw {
public static void validate(int age) {
	if (age<18){
		throw new ArithmeticException("invalid age");
	}
	else
	{
		System.out.println("valid age");
	}
}
}
