package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist2 {

	public static void main(String[] args) 
	{
		
		ArrayList<Character>al=new ArrayList<>();
		al.add('A');
		al.add('B');
		al.add('C');
		al.add('D');
		al.add('E');
		al.add(null);
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		System.out.println(al.get(5));
	//	System.out.println(al.get(6));                    //out of boundry exception
		System.out.println("**************Static for loop*********************");
		for(int i=0;i<=5;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("************** dynamic for loop*********************");
		
		for(int j=0;j<=al.size()-1;j++) 
		{
			System.out.println(al.get(j));
		}
		System.out.println("**************for each*********************");
		
		for(Character v:al) 
		{
			System.out.println(v);
		}
		
		System.out.println("**************itarator*********************");
		Iterator<Character> it=al.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
			
		}
		System.out.println("**************list itarator*********************");
		
		ListIterator<Character>li=al.listIterator();
		while(li.hasNext()) 
		{
			System.out.println(li.next());
		}
	
	}

}
