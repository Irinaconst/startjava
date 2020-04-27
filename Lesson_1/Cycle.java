public class Cycle {

	public static void main(String[] args) {
		//выведите на консоль с помощью цикла for все числа от [0,20]
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		//выведите на консоль с помощью цикла while все числа от [6,-6] (шаг итерации = 2)
		int i = 6;
		while (i >= -6) {
			System.out.println(i);
			i = i - 2;
		}

		//посчитайте с помощью цикла do-wile сумму нечетных чисел от [10,20] и выведите её на консоль
		int i = 11;
		int sum = 0;
		do {
			sum = sum + i;
			i = i + 2;
		} while (i <= 19);
		System.out.println(sum);
	}
}