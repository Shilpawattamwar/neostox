package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashseteg {

	public static void main(String[] args)
	{
		HashSet<Object> hs=new HashSet<>();
		hs.add("Pune");
		hs.add('k');
		hs.add(1.23f);
		hs.add(1345);
		hs.add("Reyansh");
		hs.add(23.56d);
		hs.add(null);
		hs.add('D');
		hs.add("ravi");
		System.out.println(hs);
		Object hs1 = hs.clone();
		System.out.println(hs.clone());                              //same elements like hs
		System.out.println(hs.contains("Ravi"));                     //its a case sensitive method so ans is false
		System.out.println(hs.contains("ravi"));
		//(hs.clear());
	   //	System.out.println(hs.isEmpty());\
		//System.out.println(hs);
		System.out.println(hs.remove('k'));
		System.out.println(hs);
		System.out.println(hs.size());
		//we can not use get() method because get method contains index and here order of insertion is random
		//for loop can't be used in set
		System.out.println("************************for each*********************************************");
		for(Object g:hs) 
		{
			System.out.println(g);
		}
		
		System.out.println("************************iterator***********************************************");
		
    	Iterator<Object> it = hs.iterator();
    	while(it.hasNext()) 
    	{
    		System.out.println(it.next());
    	}
    	
    
    
    	
    	
		
	}

}
