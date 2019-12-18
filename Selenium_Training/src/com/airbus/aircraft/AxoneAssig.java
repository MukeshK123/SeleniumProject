package com.airbus.aircraft;

public class AxoneAssig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxoneAssig assign = new AxoneAssig();
		//assign.assign2();
		//assign.multiDIm();
		assign.whileTest();
		/*
		int num = 120;
		switch(num) {
		default: System.out.println("default");
		case 0: System.out.println("case1");
		case 10*2: System.out.println("case2");
		break;
		}*/
		
	}
	
	public void assign2() {
		
		int[] array[][] = {
				null,
				{{1,2,3,4,5}},
				new int[3][0],
				{{6,7,8,9,10,11},{12,13,14,15},{16,17,18,19}}
				};
		
		System.out.println(array.length);
		//System.out.println((array[1][0])[0]);
		//int len = (array[2][0]).length;
		//System.out.println(len);
		System.out.println((array[3][2])[2]);
		}
	
	//Question number 13
		/*
		public void multiDIm() {
			
			int a[][] = new int [10][5];
			for (int i=0; i<10; i++) {
				for (int j=0; j<5; j++) {
					a[i][j] = i * j;
				}
			}
			
			System.out.println(a[0][0]);
			System.out.println(a[1][3]);
			System.out.println(a[3][4]);
		}*/
		
		public void whileTest() {
			
			int x= 0;
			while (true) {
				x=increment(x);
				System.out.println("Value of x is --" + x);
				if(x>10)
					break;
			}
		}
		
		public static int increment (int i) {
			return i + 1;
		}


	
		}
