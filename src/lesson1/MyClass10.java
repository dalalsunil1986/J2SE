package lesson1;

import java.util.LinkedList;

public class MyClass10 {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		names.addAll("mark");
		names.add("tom");
		names.add("john");
		names.addFirst("raghu");
		names.addLast("sai");
		names.size();

		for (String x : names)
			System.out.println(x);

	}
}
