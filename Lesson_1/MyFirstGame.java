public class MyFirstGame {

	public static void main(String[] args) { 
		int numberToGuess = 33;
		boolean victory = false;
		
			while (victory == false) {
				int guess = (int) (Math.random() * 101);
				if (guess == numberToGuess) {
					victory = true;
				} else if (guess < numberToGuess) {
					System.out.println("Введенное вами число меньше того, что загадал компьютер!");	
				} else if (guess > numberToGuess) {
					System.out.println("Введенное вами число больше того, что загадал компьютер!");
				}  
			}
			System.out.println("Вы угадали!");	
	}
}