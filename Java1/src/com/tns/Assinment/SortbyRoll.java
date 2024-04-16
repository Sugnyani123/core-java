package com.tns.Assinment;

import java.util.Comparator;

public class SortbyRoll implements Comparator <Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.roll-o2.roll;
	}
	

}
