package com.tns.Assinment;

import java.util.Comparator;

public class SortbyName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name-o2.name ;
		
	}
}
