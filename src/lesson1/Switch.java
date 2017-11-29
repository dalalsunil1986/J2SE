package lesson1;

public class Switch {
	public static void main(String[] args) {
		int score = 90;
		switch (score) {

		case 100:
		case 90:
			System.out.println("Very good");
			break;
		case 60:
			System.out.println("good");
			break;
		case 40:
			System.out.println("Ok");
			break;
		default:
			System.out.println("The grades are not defined");
			break;
		}// switch
	}
}
