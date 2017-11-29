package try_catch_finally;

public class Demo {
	public static int retInt() {
		int a = 100;
		try {
			return a;
		} catch (ArithmeticException e) {
			System.out.println("catch called");
			System.out.println(e);
		} finally {
			a = 5000;
			System.out.println("finally called");
			return a;
		}// finally
	}// retInt

	public static void main(String[] args) {
		System.out.println(retInt() );
	}
}// class Demo

