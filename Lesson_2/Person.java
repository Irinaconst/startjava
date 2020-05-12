public class Person {
	
	String name = "Michael";
	String gender = "man";
	float height = 1.85f;
	int weight = 85;
	int age = 24;

	boolean speak() {
		System.out.println("Привет!!!");
		return true;
	}

	void go() {
		System.out.println("Ты прошел 2 шага");
	}

	void sit() {
		System.out.println("Сидеть!");
	}

	void toRun() {
		System.out.println("Ты пробежал 10 метров");
	}

	void learnJava() {
		System.out.println("Приступай к изучению JAVA");
	}
}