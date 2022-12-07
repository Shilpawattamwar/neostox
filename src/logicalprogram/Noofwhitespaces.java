package logicalprogram;

import java.util.Scanner;

public class Noofwhitespaces {

	public static void main(String[] args) 
	{
		
		
   // 	Scanner sc=new Scanner(System.in);
		
	//	System.out.println("enter any String");
		
//		String a = sc.next();
	String a="pu  n e";
		
		 char space = ' ';
		 int count = 0;
		
		for(int i=0;i<=a.length()-1;i++) 
		{
			if(a.charAt(i)==space) 
			
			{
				count++;
			}
		}
       System.out.println("given string is "+a);
       System.out.println("no. of white spaces "+count);
       
	}

}
