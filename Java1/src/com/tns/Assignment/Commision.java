package com.tns.Assignment;

import java.util.Scanner;

public class Commision {
private String name;
private String address;
private String phone;
private double salesAmount;


public void acceptDetail()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name:");
	name=sc.nextLine();
	System.out.println("Ebter thr address:");
	address=sc.nextLine();
	System.out.println("Enter the phone number");
	phone=sc.nextLine();
	System.out.println("Enter the sales amount");
	salesAmount=sc.nextDouble();
}

public double calculateCommision() 
{
	double commision=0;
	if (salesAmount>=100000) {
		commision=salesAmount*0.10;
		else if(salesAmount>=500000) {
			commision=salesAmount*0.05;
		}
		else if(salesAmount>=30000) {
			commision=salesAmount*0.03;
		}
		return commision;
	
	}
		public static void main(String args[])
		{
			Commision employee=new Commision();
			employee.acceptDetails();
			double commision1=employee.calculateCommision();
			System.out.println("Commision:$"+commision1);
		}
	}

private void acceptDetails() {
	// TODO Auto-generated method stub
	
}
}
	
	