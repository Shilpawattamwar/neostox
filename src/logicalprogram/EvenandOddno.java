package logicalprogram;

import java.util.Scanner;

public class EvenandOddno {

	public static void main(String[] args) {
		//int a/b---> division ans 5/2=2
        //int a%b--> modulo ans 5/2=1 (reminder)
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter any number");
		int num = sc.nextInt();
	
		if(num%2==0) 
		{
			System.out.println("given num "+num+"is even");
		}
		else 
		{
			System.out.println("given num "+num+" is odd");
		}
		
	}

}
