package lesson1;

public class Forloop {
	public static void main(String[] args) {
		int[] myintarray = { 100, 31, 26, 48, 52 };
		int index;
		/*
		 * while (index < 5) { System.out.println(myintarray[index]); index++; }
		 */

		// This is 1st way:
		/*
		 * for (int index1 = 0; index1 < 5; index1++) {
		 * System.out.println(myintarray[index1]); }
		 */

		// This is 2nd way:
		for (int element : myintarray) {
			System.out.println(element);
		}
	}// main
}// class
