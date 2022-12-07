package logicalprogram;

import java.util.Scanner;

public class Factorialno {

	public static void main(String[] args) {
	//	5!=5*4*3*2*1=120
      
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter any number");
		
		int num=sc.nextInt();
		int mult=1;
		
		for(int i=num;i>0;i--) 
		{
			//System.out.println(i);
			mult=mult*i;
		}
		
		System.out.println("factorial of "+num+ " is "+mult);
		
		
		
	}

}
