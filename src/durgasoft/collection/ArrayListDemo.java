package durgasoft.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Object> arraylist = new ArrayList<Object>();
		arraylist.add("A");
		arraylist.add(10);
		arraylist.add("A");
		arraylist.add(null);
		System.out.println(arraylist);
		arraylist.remove(2);
		System.out.println(arraylist);
		arraylist.add(2, "M");
		arraylist.add("N");
		System.out.println(arraylist);
		System.out.println("10 is the instance of Integer: " + (arraylist.get(1) instanceof Integer));
	}

}
