//Reverse of n digit number 

/* LOGIC 

123  ---->             slit the number as
		
							3         then     3*100
							2				   2*10
							1				   1*1
							
                            300
						    20		
						+	1
							321
						
*/


import java.util.Scanner;

public class ReverseOfNum
{
	public static void main(String args[])
	{
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter the Number");
	
	int n= in.nextInt();
	
	int reverse=0;int rem;
	
	while(n!=0)
	{
		rem=n%10;
		reverse=(reverse*10)+rem;
		n=n/10;
	}
	System.out.println("Reverse Order:" +reverse);
	}		
}