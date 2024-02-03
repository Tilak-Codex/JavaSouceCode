// write a one line function for finding the factorial 


/*

 Conditions :-
 
	n=0  ; n>0
	
	if n=0 => return 1
	
	if n>0 => return n*fact(n-1)
	
	So, we can use condtional statement (?,:)
	
*/

import java.util.Scanner;

public class FactVarient2
{
	public static int fact(int n)
	{
		return (( n==0 || n==1)?1:n*fact(n-1));
	}
	
	public static void main(String args[])
	{
		int n;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		System.out.println("The Factorial of "+n+" is:"+fact(n));
		
	}
}