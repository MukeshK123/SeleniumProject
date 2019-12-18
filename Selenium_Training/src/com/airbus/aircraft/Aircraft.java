package com.airbus.aircraft;

public class Aircraft {
	
	//String status;

	Aircraft(String str){ 
			
			//this.status=status;
			System.out.println("value passed is " + str);
			
	}
	/**
	 * 
	 */
	void takeOff() {
		
		System.out.println("Aircraft is taking off");
		
		
	}
	String landing(int i) {
		
		//String status = new String("Aircraft Landing");
		//int i=1;
		//System.out.println("Status is" + status);
		//for(i=0;i<1;i++) {
			
			System.out.println("value passed " + i);
			
			
			
		return "Aircraft Landing";
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int number;
		
		Aircraft A380= new Aircraft("hhh");

		String returnval = A380.landing(1);
		System.out.println("value returned " + returnval);
		System.out.println(A380.landing(2));
		A380.takeOff();
		
		
		}

}
