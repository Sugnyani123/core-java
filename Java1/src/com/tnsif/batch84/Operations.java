package com.tnsif.batch84;

public class Operations {
	//method overloading
	//same method name with different signature
	//Different signature includes-
	//1.no.of arguments 2.parameters datatypes 3.order of parameters
void addition(int a ,int b) //2 integer  parameters
{
	int c;
	c= a+b;
	System.out.println("Addition is"+c);
}
void addition  (float a,float b) //2 float parameters
{
	float  c;
	c=a+b;
	System.out.println("Addition is"+c);
}
void addition(int a,float b)//2 parameters- int,float
{
	
}
void addition(float a,int b)//2 parametrs- float,int 
{

}
void addition()//without parametrs

{

}
void addition(long a,long b)
{
long c;
c=a+b;

	System.out.println("Long parameters" +c);
}
void display()
{
	System.out.println("-----------------display()-----------");
	
}
void display(String name)
{
	System.out.println("Hello"+name);
}
void display(int n, String name)
{
	for(int i=1;i<=n;i++)
		System.out.println(name);
}
}