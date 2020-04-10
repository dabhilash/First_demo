package training;

public class Swapping
{
	public static void main(String[] args) 
	{
		int a=20,b=40;
		System.out.println("Before Swpping");
		System.out.println("Value of a:"+a);
		System.out.println("Value of a:"+b);

		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After  Swpping");
		System.out.println("Value of a:"+a);
		System.out.println("Value of a:"+b);
		System.out.println("Swapping Completed");

	}

}
