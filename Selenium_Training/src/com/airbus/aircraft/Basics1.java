package com.airbus.aircraft;

public class Basics1 {
	
	//Constructor with arguements
	Basics1(String str){
		
		System.out.println("This is " +  str );
	}
	
	// method with integer as arg and return type as String
	public String method1(int i)
	{
		System.out.println("this is it");
		
		return "this is it";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 
		Basics1 java = new Basics1("ahah");
		java.method1(1);

	}

}
