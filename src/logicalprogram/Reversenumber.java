package logicalprogram;

public class Reversenumber {

	public static void main(String[] args) {
		int num=1234;
		
		//to convert int into string there is an integer method 
        
	String original = Integer.toString(num);
	String reverse = "";
	
	for(int i=original.length()-1;i>=0;i--) 
	{
		char t = original.charAt(i);
		reverse=reverse+t;
	}
	//System.out.println("reverse string is "+reverse);
		int revinint = Integer.parseInt(reverse);
		System.out.println("givenno is "+original);
		System.out.println("reverse no is "+reverse);
		
	}

}
