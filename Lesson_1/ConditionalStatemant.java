public class ConditionalStatemant {

	public static void main(String[] args) {
		int age = 30;
		if (age > 20) {
			System.out.println("Adult");
		}

		boolean isMale = true;
		if (isMale) {
			System.out.println("Hello");
		}
		if (!isMale) {
			System.out.println("Hi");
		}

		double height = 1.82;
		if (height < 1.80) {
			System.out.println("Below average height");
		} else {
			System.out.println("Above average height");
		}

		char initialLetter = 'A'; //name is Alex
		if (initialLetter == 'M') {
			System.out.println("Go straight through");
		} else if (initialLetter == 'I') {
			System.out.println("Go to the right");
		} else {
			System.out.println("Go to the left");
		}
	}
}