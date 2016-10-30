package com.java.threading.MultiThreading;

public class ThreadWaitTest {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		System.out.println("Pausing thread !");
		pause2(20000);
		System.out.println("Resumed thread !");
		System.out.println(startTime - System.currentTimeMillis());

	}
	
	public static  void pause2(long sleeptime) {
	    Object obj = new Object();
	    if (sleeptime > 0) {
	        synchronized (obj) {
	            try {
	                obj.wait(sleeptime);
	            } catch (InterruptedException ex) {
	                //ToCatchOrNot
	            }
	        }
	    }
	}

}
