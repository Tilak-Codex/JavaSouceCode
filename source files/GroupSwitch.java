import java.util.Scanner;

public class GroupSwitch
{
	public static void main(String args[])
	{
		char c;
		System.out.println("Enter a character");
		Scanner s=new Scanner(System.in);
		c=s.next().charAt(0); //takes only first character of given string.
		
		switch(c)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("char "+c+" is a vowel");
				break;
			default:
				System.out.println("char "+c+ "is consonent");
				break;
		}
	}
}
			