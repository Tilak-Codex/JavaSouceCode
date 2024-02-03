import java.util.Scanner;

public class SumAvg
{
	public static void main(String args[])
	{
		int  n,sum=0;
		 float avg;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("The Sum of "+n+" is: "+sum);
		avg=sum/n;
		System.out.println("The Avg of "+n+" is: "+avg);
	}
}



//Vareient2 ---> get limit ---> then find sum adn avg for numbers given by the usser... 