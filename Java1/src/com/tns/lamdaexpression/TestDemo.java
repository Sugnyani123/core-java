package com.tns.lamdaexpression;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable basic=()->{String threadName=Thread.currentThread().getName();
System.out.println("thread name"+threadName);};
//Instanting 2 threads

Thread thread1=new Thread (basic);
Thread thread2=new Thread (basic);
thread1.start();
thread2.start();
}}

  