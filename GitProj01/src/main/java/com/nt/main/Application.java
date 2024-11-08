package com.nt.main;

public class Application {
	
	public int sum(int a,int b) {
		return a+b; 
	}
	
    public static void main(String[] args) {
    	Application ap=new Application();
    	System.out.println("sum is::"+ap.sum(10,20));
    }
}
