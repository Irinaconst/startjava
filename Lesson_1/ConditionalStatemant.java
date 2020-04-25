public class ConditionalStatemant {

	public static void main(String[] args) {
		int age = 30;
		char genderMan = 'm';
		boolean isGender = genderMan == 'm';
		double height = 1.82;
		char initialLetter = 'A'; //name is Alex
		if (age > 20) {
			System.out.println("Adult");
		}
		if (isGender == true) {
			System.out.println("Hello");
		}
		if (!(isGender == true)) {
			System.out.println("Hi");
		}
		if (height < 1.80) {
			System.out.println("Below average height");
		} else {
			System.out.println("Above average height");
		}
		if (initialLetter == 'M') {
			System.out.println("Go straight through");
		} else if (initialLetter == 'I') {
			System.out.println("Go to the right");
		} else {
			System.out.println("Go to the left");
		}
	}
}