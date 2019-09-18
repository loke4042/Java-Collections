package arrayList;

import java.util.ArrayList;

public class AlteringCapacity {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1000);
		list.add(1000);
		list.add(1000);
		list.add(1000);
		list.add(1000);
		list.add(1000);
		list.add(1000);
		list.add(1000);
		list.add(1000);
		list.add(1000);
		list.add(1000);
		System.out.println(list.size()); 
		//ensureCapacity() method is used to increase the current capacity of an ArrayList.
		//However, capacity of an ArrayList is automatically increased when we try to add more elements 
		//than the current capacity. To manually increase the current capacity, ensureCapacity() method is used.
		
		list.ensureCapacity(30);
		System.out.println(list.size()); 
	
        //reducing the current capacity to current size of an ArrayList.
		list.trimToSize();


	}

}
