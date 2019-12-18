import java.util.Collections;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int a[] = new int[5];
		a[0] = 2;
		a[1] = 2;
		a[2] = 2;
		a[3] = 2;
		a[4] = 2;
 		
		for(int i=0;i<a.length;i++)	
		{
			//System.out.println(a[i]);
		}*/
		
		ArrayDemo ad = new ArrayDemo();
		ad.ArrayTest();
		
		

	}
	
	public void ArrayTest()
	
	{
		/* a[row] [column] */
		int b[][] = new int[1][3];
		
		/*
		1 2 4
		2 3 4
		*/
		
		
		
		b[0][0] = 1;
		b[0][1] = 2;
		b[0][2] = 5;
		
		
		System.out.println(b[0][2]);
		
		
		
		
	}

}
