package com.tns.Interface;
//program to demonstrate
public interface Amazon {
	void Welcome();
	void subscribe();//abstract method
 default void serviceCharge()//features introduced in java8 {}
{
	 
	 int amt=100;
	 
	 }
 }
