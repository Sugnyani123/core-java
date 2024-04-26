package com.tns.lamdaexpression;

import java.util.ArrayList;

public class LamdaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>li=new ArrayList<>();
li.add(10);
li.add(30);
li.add(44);
//traversing list using foreachloop
//for(Integer ele:li) {
	//System.out.println(ele);
	
	
	//}
//traversing using lamda expression
li.forEach(element-> System.out.println(element));
	}

}
