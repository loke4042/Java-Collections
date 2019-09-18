package arrayList;

import java.util.ArrayList;
import java.util.List;

public class RetriveParticularPosrtion {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
        
		list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14 );
 
 /*       System.out.println(list);     //Output : [111, 222, 333, 444, 555, 666]
 
        //Retrieving a SubList
 
        List<Integer> subList = list.subList(1, 4);
 
        System.out.println(subList);    //Output : [222, 333, 444]*/
        
        
        int size = list.size();
        System.out.println(size);
        if(size%2==1) {
        	System.out.println(list.get(size/2));
        }
        else if(size%2==0){
        	System.out.println(list.get(size/2-1));
        	System.out.println(list.get(size/2));
        }
	}

}
