/*  getting input from the user

For getting inut from the user we use Scanner class

Syntax :- Scanner object reference = new Scanner(System.in);

Various methods in Scanner Class

	1)next()-To get single word as input(ie input is feeded until space is encountered
	2)nextLine()-To get more than one word as input until enter key is encountered
	3)nextInt()-To get integer as input
	4)nextFloat()-To get float as input
	
	For more methods write te following command in the cmd -->   javap java.util.Scanner
*/

import java.util.Scanner;

public class Input
{
	public static void main(String args[])
	{
		int a,b,c;
		String name,names;
		Scanner in=new Scanner(System.in);
		System.out.println("Give value for nextInt()");
		a=in.nextInt();
		System.out.println("Give value for nextInt()");
		b=in.nextInt();
		c=a+b;
		System.out.println("Give value for next()");
		name=in.next();
		System.out.println("Give value for nextLine()");
		names=in.nextLine();    // newline character is consumed.
		names=in.nextLine();
		System.out.println("Using nextInt()"+c);
		System.out.println("Using next()"+name);
		System.out.println("Using nextLine()"+names);
	}
}

//NOTE

/*   using nextLine() after nextInt(), nextInt prouces a new line character, nextLine() method consumes this character and retuens a empty string */