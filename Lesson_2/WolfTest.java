public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.sexOf = "male";
		wolfOne.nickname = "Hunter";
		wolfOne.weight = 80;
		wolfOne.age = 4;
		wolfOne.color = "grey";
		System.out.println("sexOf = " + wolfOne.sexOf);
		System.out.println("nickname = " + wolfOne.nickname);
		System.out.println("weight = " + wolfOne.weight);
		System.out.println("age = " + wolfOne.age);
		System.out.println("color = " + wolfOne.color);
		wolfOne.go();
		wolfOne.sit();
		wolfOne.toRun();
		wolfOne.howl();
		wolfOne.hunt();
	}
}