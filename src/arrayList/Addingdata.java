package arrayList;
import java.util.ArrayList;


public class Addingdata {

	public static void main(String[] args) {


		Addingdata a = new Addingdata();
		System.out.println("Integer ArrayLIst :"+a.addingIntData());		
		System.out.println("String AyyaList   :"+a.addingStrData());
		System.out.println("FLoat ArrayList   :"+a.addfloatData());
	}

	//Adding Integer data to the ArrayList
	public ArrayList<Integer> addingIntData() {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(70);
		l.add(40);
		l.add(50);
		l.add(0);
		l.add(20);
		l.add(60);
		return l;
	}


	//Adding String data to the ArrayList
	public ArrayList<String> addingStrData() {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Lokesh");
		l.add("yanati");
		l.add("siddi");
		return l;
	}


	//Adding float data to ArrayList
	public ArrayList<Float> addfloatData() {
		ArrayList<Float> l = new ArrayList<Float>();
		l.add(10.5f);
		l.add(34.567f);
		l.add(87.009f);
		l.add(10f);
		return l;
	}

}