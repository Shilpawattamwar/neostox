package exceptionhandling;

public class TryCatch {

	public static void main(String[] args) {
		
		String a=null;
		
		try 
		{
			System.out.println(a.charAt(6));
		}
		catch(IndexOutOfBoundsException e) 
		{
			System.out.println("check string index or size");
		}
		catch(NullPointerException e) 
		{
			System.out.println("a is null check the string");
		}
		catch(Exception e) 
		{
			System.out.println("there are some exception plz check");
		}
		System.out.println("hi, good morning");

	}

}
