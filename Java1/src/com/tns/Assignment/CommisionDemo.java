package com.tns.Assignment;
import java.util.Scanner;
public class CommisionDemo {

	
	public static void main (String args[])
{
	//Autogenerated methods
Commision c=new Commision();
String name,address;
long  phone,salesAmount;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name");
name=sc.nextLine();

System.out.println("Enetr the Address");
address=sc.nextLine();

System.out.println("Enter the phoneNo");
phone=sc.nextLong();

System.out.println("Enter the salesAmount");
salesAmount=sc.nextLong();

c.setName(name);
c.setAddress(address);
c.setPhone(phone);
c.setSales_Amount(salesAmount);
double commision=c.calculateCommision();
System.out.println("The Commision for" + Sales_Amt + " is:"+commision);

      }
	}