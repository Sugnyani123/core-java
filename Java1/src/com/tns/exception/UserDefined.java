package com.tns.exception;

import java.util.Scanner;

public class UserDefined {
private int age;
static void  validate() throws Age {//age is user defined exception
	Scanner sc=new Scanner(System.in);
     age  = sc.nextInt();
    
if( age > 18 )
{
	throw new Age("Invalid age");
}
else
{
	System.out.println("Valid age");
}
}
}