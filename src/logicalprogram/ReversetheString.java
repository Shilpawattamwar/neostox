package logicalprogram;

import java.util.Scanner;

public class ReversetheString {

	public static void main(String[] args) {
	
		
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter string");
		String original = sc.next();
		
		System.out.println(original);
		 String reverse="";
		
		for(int i=original.length()-1;i>=0;i--)    //pune
		
		{
			char s = original.charAt(i);
			reverse=reverse+s;
		}
		
		System.out.println("reverse string is "+reverse);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	System.out.println("enter value of string");
		
	//	String original = sc.next();
	//	System.out.println(original);
	//	String reverse="";
		
	//	for(int i=original.length()-1;i>=0;i--)
	//	{
	//		char  t=original.charAt(i);
		//	reverse=reverse+t;
			
	//	}
	//	System.out.println("Reverse of string is "+reverse);

	}

}
