package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(70);
		l.add(40);
		l.add(50);
		l.add(0);
		l.add(20);
		l.add(60);
		ArrayListIteration iteration = new ArrayListIteration();
		iteration.forLoop(l); 
		iteration.forEach(l); 
		iteration.Usingiterator(l);
		iteration.UsingListiterator(l);
	}

	//Using For Loop
	public void forLoop(ArrayList<Integer> list) {
		System.out.println("=========for loop=========");
		for(int i=0;i<list.size();i++) {
			System.out.println((Integer)list.get(i));
		}
	}

	//Using For-Each Loop
	public void forEach(ArrayList<Integer> list) {
		System.out.println("=========for Each Loop=========");
		for(Integer num : list) {
			System.out.println((Integer)num);
		}
	}

	//Using Iterator
	public void Usingiterator(ArrayList<Integer> list) {
		System.out.println("=========Iterator=========");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer n = itr.next();
			System.out.println(n);
		}

	}
		//Using listIterator
		public void UsingListiterator(ArrayList<Integer> list) {
			System.out.println("=========List Iterator=========");
			 ListIterator<Integer> itr = list.listIterator();
			while(itr.hasNext()) {
				Integer n = itr.next();
				System.out.println(n);
			}
	}

}
