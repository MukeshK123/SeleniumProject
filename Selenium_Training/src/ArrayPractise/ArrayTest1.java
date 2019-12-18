package ArrayPractise;

import java.util.Arrays;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to sort a numeric array and a string array	
		
		//String str = "Hello";
		
		ArrayTest1 test = new ArrayTest1();
		//test.intSort();
		//test.strSort();
		//test.add();
		test.sort();
		
	}
	/*
	public void intSort()
	{
		int[] i = {7,2,9,4};
		int b[] = {14,20,25,35};
		
		
		
		Arrays.sort(b);
		
		System.out.println(Arrays.toString(i));
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		//System.out.println(Arrays.sort(i));
		
		for(int j=0;j<b.length;j++)
			
		{
			//System.out.println(b[j]);
			System.out.println(Arrays.toString(b));
		}
		
		
	}*/
	/*
	public void strSort()
	{
		String[] str = {"H","W","B"};
		
		System.out.println(Arrays.toString(str)); 
		
		Arrays.sort(str);
		
		System.out.println(Arrays.toString(str));
	}*/
	/*
	public void add()
	{
		
		int b[] = {7,2,9,4};
		int sum = 0;
		
		for(int i : b )
		{
			sum += i;
			
		}
		System.out.println(sum);
}*/
	
	public void sort()
	{
		int b[] = {7,2,9,4};
		//int c[] ;
		String s = "";
		for (int i = 0; i<b.length; i++)
		{
			if(b[0]<=b[1])
			{
				//System.out.println(s+= b[i]);
				s = ""+ b[1];
				System.out.println(s);
			}
			
			else
			{
			System.out.println("--------------");
			s =""+ b[i];
			System.out.println(s);
		}
		
		}
		
		
	}
	

}
	

