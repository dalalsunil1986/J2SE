import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] argv) throws Exception {
		String[] strArray = new String[] { "z", "a", "java2s.com" };
		List list = Arrays.asList(strArray);

		Collections.sort(list);

		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);

		Collections.sort(list, Collections.reverseOrder());

		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		Collections.reverse(list);
	}
}