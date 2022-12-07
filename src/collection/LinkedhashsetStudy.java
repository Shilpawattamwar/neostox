package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashsetStudy {

	public static void main(String[] args) 
	{
		LinkedHashSet<Object> ls=new LinkedHashSet<>();
		ls.add("Suraj");
		ls.add(45);
		ls.add('G');
		ls.add(45.634d);
		ls.add("Pune");
		ls.add("Pune");
		ls.add("Delhi");
		ls.add('d');
		ls.add(true);
		ls.add(null);
		ls.add(30);
		
		System.out.println(ls);
		System.out.println(ls.clone());
		System.out.println(ls.contains("Pune"));
		System.out.println(ls.isEmpty());
		System.out.println(ls.remove("Pune"));
		System.out.println(ls);
		System.out.println(ls.size());
	//	ls.clear();
		System.out.println(ls);
		 //here we cannot use for loop because in set we dont use index so get() by index is not used and not used for loop
		System.out.println("***************for each********************************");
	  for(Object combo:ls) 
	   {
		System.out.println(combo);
	   }
	  
	  System.out.println("******************iterator********************************");
	  Iterator<Object> it = ls.iterator();
	  while(it.hasNext()) 
	  {
		  System.out.println(it.next());
	  }
		
	}

}
