package exceptionhandling;

public class TryandFinally {

	public static void main(String[] args) 
	{
		
	//	int a=10;
	//	int b=0;
	//	int c=a/b;   //risky code
		
		String a="pune";
		
		try 
		{
			System.out.println(a.charAt(7));
		}
		finally 
		{
			System.out.println("good night");
		}
		

	}

}
