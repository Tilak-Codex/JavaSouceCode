import java.util.Scanner;

public class Factorial
{
	public static void main(String args[])
	{
		int n,i,fact;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		n=in.nextInt();
		fact=1;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of "+n+" is: "+fact);
	}
}