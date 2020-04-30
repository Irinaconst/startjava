public class MyFirstGame {

	public static void main(String[] args) {
		int numberToGuess = 33;
		int guess;
		boolean victory = false;
		while ( victory == false) {
			guess = 15; 
			if (guess == numberToGuess) {
				victory = true;
			}
			else if (guess < numberToGuess) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер!");	
			}
			else if (guess > numberToGuess) {
				System.out.println("Введенное вами число больше того, что загадал компьютер!");
			} victory = true; 
			} 
			System.out.println("Вы угадали!");
		}
	}


		