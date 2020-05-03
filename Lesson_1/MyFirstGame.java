public class MyFirstGame {

	public static void main(String[] args) { 
		int numberToGuess = 33;
		
		do {
			int guess = (int) (Math.random() * 101);
			if (guess == numberToGuess){
				System.out.println("Вы угадали!");	
			} else if (guess > numberToGuess) {
				System.out.println("Введенное вами число больше того, что загадал компьютер!");
			} else {
				System.out.println("Введенное вами число меньше того, что загадал компьютер!");
			}	
		} while (false);
		
	}
}


		