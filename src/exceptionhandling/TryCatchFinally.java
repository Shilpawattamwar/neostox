package exceptionhandling;

public class TryCatchFinally {

	public static void main(String[] args)
	{
		String b=null;
		try 
		{
			System.out.println(b.length());
		}
		
		catch(NullPointerException e) 
		{
			System.out.println("b is null");
		}
		finally 
		{
			System.out.println("good morning");
		}
		

	}

}
