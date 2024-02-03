//unary operators

public class Unary
{
	public static void main(String args[])
	{
		//post increment
		System.out.println("post increment");
		int a=11;
		//case I - Not in print statement
		a++;
		System.out.println("Not in print statement  " +a);
		//Case- II - In print stement
		System.out.println("In print statement  " +a++);
		System.out.println("In print statement after post increment  " +a);
		
		
		//pre increment
		System.out.println("pre increment");
		//case I - Not in print statement
		++a;
		System.out.println("Not in print statement  " +a);
		//Case- II - In print stement
		System.out.println("In print statement  " + ++a);
		System.out.println("In print statement after post increment  " +a);
		
	}
}