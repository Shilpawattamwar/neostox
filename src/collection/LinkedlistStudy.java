package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistStudy {

	public static void main(String[] args) 
	{
		LinkedList<String> ll= new LinkedList<>();
		
		ll.add("Parbhani");
		ll.add("Sudhir");
		ll.add("123");
		ll.add(null);
		ll.add("true");
		ll.add("false");
		ll.add(null);
		ll.add("12.45");
		ll.add("Pune");
		ll.add("Dharur");
		ll.add("king");
		System.out.println(ll);
		
		System.out.println(ll.size());
	//	System.out.println(ll.capacity);     //linked list have no capacity
		System.out.println(ll.contains("Parbhani"));
		System.out.println(ll.contains("Shilpa"));
		System.out.println(ll.element());       //element() gives first element of the list 
		System.out.println(ll.get(1));
		System.out.println(ll.getFirst());     //getfirst() =element() =peek() =peekfirst()
		System.out.println(ll.getLast());
		System.out.println(ll);
		System.out.println(ll.getClass());
		System.out.println(ll.offer(null));    //returns booleanvalue true and add at last of the list
		System.out.println(ll);
		System.out.println(ll.offerFirst("Sudhir"));     //it gives boolean and add first element as Sudhir
		System.out.println(ll);
		System.out.println(ll.offerLast("Reyansh"));     //it gives boolean and add last element as Reyansh
		System.out.println(ll);
		System.out.println(ll.peek()); 
		System.out.println(ll.peekFirst());
		System.out.println(ll);
		System.out.println(ll.peekLast());
		System.out.println(ll.poll());   //poll() returns and remove first element of the list
		System.out.println(ll);
		System.out.println(ll.pollFirst());   //poll() =pollfirst() =pop()
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll);        //polllast() returns and remoe last element of the list
		System.out.println(ll.pop());
		System.out.println(ll);
		System.out.println(ll.set(4, "Ravi"));     //returns that value which should be replaced by
		System.out.println(ll); 
		
		System.out.println("********************for loop****************************************");
		for(int i=0; i<=ll.size()-1;i++) 
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("********************for each loop****************************************");
		for(String con:ll)
		{
			System.out.println(con);
		}		
		
		System.out.println("********************itarator****************************************");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		System.out.println("********************list itarator****************************************");
		ListIterator<String> lil = ll.listIterator();
		while(lil.hasNext())
		{
			System.out.println(lil.next());
		}
		
		
		
	}

}
