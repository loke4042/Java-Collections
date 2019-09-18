package arrayList;

import java.util.ArrayList;

public class ElementIsPresentOrNot {

	public static void main(String[] args) {

		ArrayList<Integer>	list = new ArrayList<Integer>();
		list.add(0, 1);
		list.add(2);
		list.add(3);
		list.add(4);
		presentorNot(list,1);
	}
 public static void presentorNot(ArrayList<Integer> lis,int given_element) {
	if(lis.contains(given_element)) {
		System.out.println("List contains the given element");
	}

	else System.out.println("List doesnt contain the given element");
 
 }
}
