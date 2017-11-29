package lesson1;
import java.util.*;
public class MyClass9 {
	public static void main(String[] args) {
		int simple_array[]=new int[5];
		ArrayList<Integer>myList=new ArrayList<Integer>(5);
		myList.add(1);
		myList.add(5);
		myList.add(3);
		myList.add(25);
		myList.add(93);
		
		for(Integer x: myList)
			System.out.println(x);
		System.out.println("size ="+myList.size());
		
		for(Integer x: myList)
			System.out.println(x);
		System.out.println("size ="+myList.size());
		
	}
}
