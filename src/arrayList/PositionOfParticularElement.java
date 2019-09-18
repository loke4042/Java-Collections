package arrayList;

import java.util.ArrayList;

public class PositionOfParticularElement {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(3);
		list.add("Lokesh");
		list.add("subhash");
		list.add("shayam");
		list.add("sai");
		list.add("Lokesh");
		indexof(list,"subhash");
		lastindexof(list,"Lokesh");
	}
	
	//indexOf()
	
	public static void  indexof(ArrayList<String> l,String element) {
		int index = l.indexOf(element);
		if(index>=1) {
			System.out.println("index of the given element :"+index);
		}
		else System.out.println("List doesnt contain the given element");

	}
	
	
	
	//lastindexOf()
	public static void  lastindexof(ArrayList<String> l,String element) {
		int index = l.lastIndexOf(element);
		if(index>=1) {
			System.out.println("index of the given element :"+index);
		}
		else System.out.println("List doesnt contain the given element");

	}
}
