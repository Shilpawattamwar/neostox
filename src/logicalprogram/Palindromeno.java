package logicalprogram;

import java.util.Scanner;

public class Palindromeno {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
		
		System.out.println("enter value of string");
		
		String original = sc.next();
		System.out.println(original);
		String reverse="";
		
		for(int i=original.length()-1;i>=0;i--)
		{
			char  t=original.charAt(i);
			reverse=reverse+t;
			
		}
		System.out.println("Reverse of string is "+reverse);

	
     if(original.equals(reverse)) 
     {
    	 System.out.println("string is palindrome");
     }
     else 
     {
    	 System.out.println("String is not palindrome");
     }

	}
}

