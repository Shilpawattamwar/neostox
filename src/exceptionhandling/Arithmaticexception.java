package exceptionhandling;

public class Arithmaticexception {
	int c;

	public static void main(String[] args)
	{
	
		int a=10;
		int b=0;
		int c=a/b;
	//	System.out.println("value of c is "+c);
		try 
		{
		    c=a/b;
		}
		catch(NullPointerException e) 
		{
			System.out.println("value is not null");
		}
		catch(ArithmeticException e) 
		{
			System.out.println("we cant devide by 0 ,please check value of b");
		}
		
		System.out.println("hello");
		

	}

}
