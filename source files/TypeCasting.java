//type casting : converting premitive datatypes.

/*

i) widening (smaller --> bigger)

	BYTE --> SHORT --> CHAR --> INT --> LONG --> FLOAT --> DOUBLE

	just use assignment operator(=)

ii) narrowing (bigger --> smaller)
	
	DOUBLE --> FLOAT --> LONG --> INT --> CHAR --> SHORT --> BYTE
	
	use (datatype required)value/variable;
*/


public class TypeCasting
{
	public static void main(String args[])
	{
		//wideing tye casting
		
		int a=15;
		double b=a;
		System.out.println("Int :"+a);
		System.out.println("Double :"+b);
		
		//narrowing typecasting
		
		double c=23.2323;
		int d=(int)c;
		System.out.println("Double :"+c);
		System.out.println("Int :"+d);
		
	}
	
}
		