package com.airbus.aircraft;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String str = " This is a £Country ";
		System.out.println(str.charAt(10));
		System.out.println(str.indexOf("£"));
		//System.out.println(str.strip());
		System.out.println(str);*/
		
		StringTest test = new StringTest();
		test.reverseString();
		
		
	}
	
	public void reverseString()
	
	{	
		String rev = "doGeeseseeGod";
		String fwd = "";
		for (int i=rev.length()-1;i>=0;i--)
		{
			//fwd = fwd+ rev.charAt(i);
			fwd =fwd+ rev.charAt(i); // concatinating 2 strings
			
			//System.out.println(fwd+ rev.charAt(i));
		}
		System.out.println(fwd);
		System.out.println(rev);
		//if(rev==fwd) doesn't work.
		
		if(rev.equals(fwd))
		{
			System.out.println("Its a palindrome");
		}
		
		/*
		String fwd = "DoGeeseseeGod";
		for (int i=0; i<fwd.length();i++)
		{
			
			System.out.println(fwd.charAt(i));
			
		}*/
			
	}
	

}
