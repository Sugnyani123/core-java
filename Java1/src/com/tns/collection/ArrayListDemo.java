package com.tns.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
public static void main(String args[])
{
	ArrayList li=new ArrayList();
	System.out.println("check the list has elements or not  =  "+""+li.isEmpty());
System.out.println("check the size"+" "+li.size());
li.add(22);
li.add("hello");
li.add(44);
System.out.println("The elements of the list are " + " " +li);

System.out.println("to check whether the elements are present or not" + " " +li.contains(li));
System.out.println("elements  at the given position"+li.get(2));
System.out.println("remove the elements"+li.remove(0));
System.out.println("the elements of the list are " + "" +li);
ArrayList <String>ob= new ArrayList();

ob.add("suma");
ob.add("ramya");
ob.add("priya");

Collections.sort(ob);

Iterator <String>i=ob.iterator();
while(i.hasNext());
String nm=i.next();
System.out.println(nm);
}
}
