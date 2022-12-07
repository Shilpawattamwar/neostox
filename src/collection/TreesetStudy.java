package collection;

import java.util.TreeSet;

public class TreesetStudy {

	public static void main(String[] args) 
	{
		TreeSet<Object> trr=new TreeSet<>();
		trr.add(3);
	//	trr.add("Suraj");  //here is exception ie.classcast exception because of not same values in the treeset
		trr.add(4);
		trr.add(5);
		trr.add(1);
		trr.add(3);  //doesn't allow duplicate and in accending order
		trr.add(2);
		trr.add(7);
		System.out.println(trr);
		System.out.println(trr.ceiling(6)); //returns greater than and equal to element
		System.out.println(trr);
		System.out.println(trr.first()); //returns first element
		System.out.println(trr);
		System.out.println(trr.floor(6)); //returns greater element les than or equal to given element
		System.out.println(trr.last());
		System.out.println(trr.lower(5));  //returns stictly less than gien value
		System.out.println(trr.higher(7));//returns greater element if present or gives null no such element present
		

	}

}
