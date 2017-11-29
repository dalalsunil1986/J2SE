package lesson1;

import java.util.*;

public class MyClass11 {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Mark");
		names.add("tom");
		names.add("john");
		names.add("jack");
		names.add("patrik");
		
		ListIterator<String> itr=names.listIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println(""); System.out.println("");
		while(itr.hasPrevious())
			System.out.println(itr.previous());
	}
}
