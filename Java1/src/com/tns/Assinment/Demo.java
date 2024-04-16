package com.tns.Assinment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Student> s=new ArrayList<Student>();
      s.add(new Student("Sugnyani","Bhalki",1));
      s.add(new Student("Shivani","Benglore",2));
      s.add(new Student("Saba","Hydrabad",3));
      
      
      System.out.println("Comparing by name ");
      SortbyName sortname=new  SortbyName();
      Collections.sort(s,sortname);
      for(Student  student: s )
      {
      System.out.println(student);
	  }
      
	
      System.out.println("Comparing by rollno");
      for(Student student:s)
      {
      System.out.println(student);
	  }
      SortbyRoll sortroll=new  SortbyRoll();
      Collections.sort(s,sortroll);
      
      
           
	}     
}