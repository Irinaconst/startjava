public class MyFirstGame {

	public static void main(String[] args) {
		int rand = 45; //компьютер загадывает целое число
		int num = 45; //число, введенное пользователем
		do {
			if (num > rand) {
				System.out.println("Введенное вами число больше того, что загадал компьютер!");
			} else if (num < rand) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер!");	
			} else {
			System.out.println("Вы угадали!");
			}
		}while (num != rand);	
	}
}