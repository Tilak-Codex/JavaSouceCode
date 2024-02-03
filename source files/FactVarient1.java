//Factorial using Recursion

/*
Let's Understand

	5!=5*4*3*2*1  ;   4!=4*3*2*1
	
SO
	5!=5*4!
	
Let's dereive comman Formulea
	
	n! =   n*(n-1)!    when n>0        
	but when n=0  
	 we cant apply this formula =>  0!=0*(-1)!  
	 this is not valid.
	 Becuase Factorial of NEGATIVE NUMBER is not defined.
	  
	So we have to define a condition for n=0 ;   0!=1
*/

import java.util.Scanner;

public class FactVarient1
{
	
	
	public static int fact(int x)
	{
		int fact;
		
		if(x==0)
		{
			return 1;
		}
		return(x*fact(x-1));
	}
	public static void main(String args[])
	{
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter a number for finding the factorial...");
		n=in.nextInt();
		if(n>=0)
		
		System.out.println("Facotrial of " +n+ " is: "+fact(n));
			
		else

		System.out.println("please enter a postive number...");
	}
}