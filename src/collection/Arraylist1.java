package collection;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) 
	{
		ArrayList ar=new ArrayList();
		ar.add("velocity");
		ar.add(123);
		ar.add('m');
		ar.add(123.55f);
		ar.add("velocity");
		ar.add(null);
		ar.add(null);
		ar.add(true);
		ar.add(false);
		System.out.println(ar);
		
		ar.add(23.45);
		System.out.println(ar);
		
		System.out.println(ar.size());                         //size method
		System.out.println(ar.contains("Pune"));                //contains method
		System.out.println(ar.contains("velocity"));
		System.out.println(ar.get(9));                        //get method like char at() in string
		System.out.println(ar.get(3));    
//		System.out.println(ar.get(22));                      //exception index out of boundry
		
		System.out.println(ar.indexOf("m"));      //garbage value
		System.out.println(ar.indexOf('m'));
		System.out.println(ar.lastIndexOf("velocity"));
		System.out.println(ar.isEmpty());
		System.out.println(ar.remove(true));
	//	System.out.println(ar.remove(123));
		System.out.println(ar);
		System.out.println(ar.remove(0));
		System.out.println(ar);
//	     ar.clear();
	     System.out.println(ar);
	     System.out.println("*********************************************");
	     
	     for(Object p:ar) {                                 //for each loop
	    	 
	    	 System.out.println(p);
	     }
		
		
		
	}

}
