package logicalprogram;

public class Primenumber {

	public static void main(String[] args)
	{
		
		//prime number is the no whose factors are 1 and itself no
		
		//11--->2,3,4,5,6,7,8,9,10
		
		
		int num= 11;
		int count=0;
		for(int i=2;i<num;i++) 
		{
			if(num%i==0) 
			{
				count++;
				break;
			}
		}
		
		if(count==1) 
		{
			System.out.println("no is not prime number");
		}
		else 
		{
			System.out.println("given no "+num+" is prime number");
		}
		
		
		

	}

}
