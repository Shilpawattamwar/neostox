package collection;

import java.util.Enumeration;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vectorstudy {

	public static void main(String[] args) 
	{
		Vector<Object> v=new Vector<>();
		
		v.add("Pune");
		v.add('A');
		v.add(1.23f);
		v.add(2674);
		v.add(null);
		v.add(true);
		v.add("Pune");
		v.add(null);
		System.out.println(v);
		
		System.out.println(v.size());
		System.out.println(v.contains("pune"));
		System.out.println(v.contains("Pune"));
		System.out.println(v.remove("Shilpa"));      //it doesnt contain shilpa so return false at output and not remove any value if takes null then remove 2 null values and return true at output
		System.out.println(v);
		System.out.println(v.capacity());  //returns default capacity as 10);		
		v.add("hi");
		v.add("Delhi");
		v.add('S');
		v.add(true);
		System.out.println(v);	
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println("***************for loop*****************************************");
		
		for(int i=0;i<=v.size()-1;i++) 
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("********************for each****************************************");
		for(Object sh:v) 
		{
			System.out.println(sh);
		}
		
		System.out.println("********************for itarator*************************************");
		
		Iterator<Object>it=v.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("*********************for list itarator*******************************");
		
		ListIterator<Object>li=v.listIterator();
		while(li.hasNext()) 
		{
			System.out.println(li.next());
		}
		System.out.println("*********************for enumarator*************************************");
		
		Enumeration<Object> em=v.elements();
		while(em.hasMoreElements()) 
		{
			System.out.println(em.nextElement());
		}
		
	}

}
