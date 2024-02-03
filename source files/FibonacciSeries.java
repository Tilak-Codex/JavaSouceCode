// Fibonacci series ---> 0 1  1  2  3  5  8  13 ...n

import java.util.Scanner;

public class FibonacciSeries
{
	
	public static void main(String args[])
	{
			int a=-1,b=1,c,n;                                                                              
			Scanner in=new Scanner(System.in);
			System.out.println("Please enter the number: ");
			n=in.nextInt();
			System.out.println("The numbers until needed are:");
			for(int i=0;i<n;i++)
			{
				c=a+b;
				a=b;
				b=c;
				System.out.println(c);
	}		}
}

 /*    Required Series--->   0    1     1    2    3    5     8 ...
 
             num1=-1
			 num2=+1
			 (num3)num1+num2=(-1)+(+1)=0     GOT THE FIRST NUMBER...
			 
			 Swappping
			 num1=num2
			 num2=num3
			 
 
 
 
 */