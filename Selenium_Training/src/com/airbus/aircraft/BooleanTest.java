package com.airbus.aircraft;

public class BooleanTest {

	boolean [] b = new boolean[3];
	int count = 0;
	
	private void set(boolean[] x, int i)
	{
		x[i] = true;
		++count;
		System.out.println("count = " + count);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BooleanTest bt = new BooleanTest();
		/*
		bt.set(bt.b, 0);
		bt.set(bt.b, 2);
		bt.test();
		bt.modulus();
		bt.bool();
		bt.loop();
		bt.loop19();
		bt.whileLoop();*/
		bt.output21();
	}
	
	private void test()
	{
		
		if(b[0] && b[1]|b[2])
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
			count++;
		System.out.println("count = " + count);
		if(b[1] && b[++count -2]) // what is this statement doing
		System.out.println(b[1]);
		System.out.println("count = " + count);
			count += 7;
		System.out.println("count = " + count);
	}
	
	//question no 15:
	
	public void modulus()
	{
		int i =2;
		while (makeDecision(i))
		{
			i = i * i;
			System.out.println(i);
		}
	}
	
	public static boolean makeDecision(int i)
	
	{
		if(i % 3 !=0)
		{
			return true;
		} else {
			return false;
		}
	}
	
	//Question no 17.
	
	public void bool() {
		
		boolean b = true;
		if(b==true) {
			b=false;
			System.out.println(b);
			}
		//return false;
		
	}
	
	//Question no 18.
	
	public void loop() {
		
		int b = 100;
		//boolean c;
		
		for(int i =1; i<b ; i++) {
			
			if(i % 2 == 0)
			{
				System.out.println( "Even Numbers from 1 to 100 are " + i );
			}
			
		}
	}
	
	//Question no 19.
	
        public void loop19() {
		
		int b = 100;
		//boolean c;
		
		for(int i =1; i<b ; i++) {
			
			if(i % 5 == 0)
			{
				System.out.println( "Divisible by 5 " + i );
			}
			
		}
	}

  //Question no 20.
         public void whileLoop() {
        	 
        	 int c = 0;
        	 int sum = 0;
        	 
        	 //for (int i=0;i<c;i++) 
        	 while(c<100)
        	 {
        		
        		//sum += c;
        		 sum = c + sum;
        		 c++;
        		 
        		 
        	 }
        	 System.out.println(sum);
        	 
}
   //Question no 21.
         
         
         public void output21() {
        	 
        	int d;
          	for(int i=0;i<10;i++) {
        		     		
        	System.out.println(i);
        	
        	}
        	
         }
         
       //Question no 21.
         /*
         public boolean method()
         
         {
        	 
        	 
        	 return;
         }*/
}
