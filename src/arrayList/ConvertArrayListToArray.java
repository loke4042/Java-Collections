package arrayList;

import java.util.ArrayList;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Lokesh");
		list.add("subhash");
		list.add("shayam");
		list.add("sai");
		list.add("Lokesh");
		Object[] arr = toarray(list);
		System.out.println(arr[0]);
	}
	public static Object[] toarray(ArrayList<String> l)
	{
		Object[] arr = l.toArray();
		return arr;
	}

}
