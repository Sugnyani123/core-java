package com.tns.streamapi;

import java.util.stream.Stream;

public class StreamOperation {
void allOperation()
{
//Stream <Integer> st= Stream.of(10,20,30,40);
//st.forEach(e->System.out.println(e));
//System.out.println(st.count());
Integer[] values=new Integer[] {10,20,30,40}; 
Stream<Integer>st=Array.stram(values);
//limit
System.out.println("The first two numbers in the array are");
//Arrays.stram(values).limit(2).forEach(System.out::println);
Arrays.stram(values).skip(2).forEach(System.out::println);
//skip
System.out.println("skip fiirst 2 no's in the array are");
st.filter(num->num>5).forEach(System.out::println);}


//map
System.out.println("The square of the no's are ");
st.map(num->num*num).forEach(System.out::println));
//filter
System.out.println("no's greater than 5");
st1.filter(num->num>5).forEach(System.out::println);}
}}}}}}
