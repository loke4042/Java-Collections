package arrayList;

import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ArrayListIsEmptyorNot {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		emptyornot(list);
		emptyornot(list1);
	}
	
	
	
	
	
	
	
	public static void emptyornot(ArrayList<Integer> l) {
		if(l.isEmpty()) 
			System.out.println("List is  Empty");
		
		else 
			System.out.println("List is not Empty");
		
	}



}
