package com.tns.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayList<Integer>ob=new ArrayList();
	List<Laptop> laps=new ArrayList<Laptop>();
laps.add(new Laptop("dell",15,209888));
laps.add(new Laptop("Hp",15,209889));
laps.add(new Laptop("Lenovo",15,209898));
Collection.sort(laps);

for(Laptop l:laps) {
	System.out.println(l);
}
}
}