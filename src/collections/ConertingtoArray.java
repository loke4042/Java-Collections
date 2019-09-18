package collections;

import java.util.ArrayList;

public class ConertingtoArray {

	public static void main(String[] args) {
		ArrayList<String> arrlist= new ArrayList<String>();
		  arrlist.add("Apple");
		  arrlist.add("Banana");
		  arrlist.add("Mango");
		  arrlist.add("Pear");

		  /*ArrayList to Array Conversion */
		  String array[] = new String[arrlist.size()];   
		  for(int j =0;j<arrlist.size();j++){
		    array[j] = arrlist.get(j);
		  }
		  
		  for(int i=0;i<array.length;i++) {
			  System.out.println(array[i]);
		  }
	}

}
