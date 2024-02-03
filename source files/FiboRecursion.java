//FIBONACCI SERIES USING RECURSION

/*  LOGIC 

	pick a number at random in fibonacci series    0  1  1  2  3  5  8
	
	Let's pick number  5   at position  5
	
	Observe the numbers at previous and next  prvious position
	
	They are   3  and  2 respectively
	
	3 +2 =5
	
	so fib(n-1)+fib(n-2)=fib(n)
	
	
*/


import java.util.Scanner;

public class FiboRecursion
{
	public static int fib(int n)
	{
		if (n<=1)
		return n;
		
		return(fib(n-1)+fib(n-2));
	}
	
	public static void main(String args[])
	{
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter a number..:");
		n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println(fib(i)+" ");
		}
		
	}

}