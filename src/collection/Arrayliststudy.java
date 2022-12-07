package collection;

import java.util.ArrayList;

public class Arrayliststudy {

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
		
		
		ArrayList<String> ar1=new ArrayList<>();
		ar1.add("Sachin");
		ar1.add("Virat");
		ar1.add("Dhoni");
		ar1.add("Rohit");
		ar1.add("Surya");
		ar1.add(null);
		
		System.out.println(ar1);

	}

}
