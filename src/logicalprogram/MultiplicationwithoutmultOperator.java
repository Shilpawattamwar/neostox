package logicalprogram;

import java.util.Scanner;

public class MultiplicationwithoutmultOperator {

	public static void main(String[] args)
	{
		
		//int 5*4=5+5+5+5=20
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter num a");
		
		int a=sc.nextInt();
		
       System.out.println("enter num b");
		
		int b=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=b;i++) 
		{
			sum=sum+a;
		}
		
		System.out.println("multiplication is "+sum);
	}

}
