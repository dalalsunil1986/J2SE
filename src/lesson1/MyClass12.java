package lesson1;

import java.util.*;

public class MyClass12 {
	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
		name.add("Mark");
		name.add("Mark");
		name.add("jack");
		name.add("july");
		name.add("patrik");
		System.out.println();

		Iterator<String> itr = name.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}
}
