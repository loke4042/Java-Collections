package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ConstructingAnArray {

	public static void main(String[] args) {
		
        HashSet<Integer> set = new HashSet<Integer>(40);
        set.add(123);
        set.add(124);
        set.add(125);
        set.add(126);
        set.add(127);
        set.add(128);
        set.add(129);
        set.add(130);

		ArrayList<Integer> list1 =new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>(400);
		ArrayList<Integer> list3 = new ArrayList<Integer>(set);
		Collections.sort(list3);
		
		
		System.out.println(list3.size());
		System.out.println(set.size());
		System.out.println(list3);
		
	}

}
