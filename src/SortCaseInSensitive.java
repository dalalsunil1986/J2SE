import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCaseInSensitive implements Comparator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public final int compare(Object a, Object b) {
		String a1 = a.toString().toLowerCase();
		String b1 = b.toString().toLowerCase();
		return a1.compareTo(b1);
	}

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("Aviation");
		lst.add("aerospace");
		lst.add("Aeronautics");
		lst.add("aerodynamics");
		lst.add("Aerospace");
		Collections.sort(lst, new SortCaseInSensitive());
		System.out.println(lst);
	}
}