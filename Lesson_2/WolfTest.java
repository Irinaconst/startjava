public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setSex("male");
		wolfOne.setNickname("Hunter");
		wolfOne.setWeight(80);
		wolfOne.setAge(4);
		wolfOne.setColor("grey");

		System.out.println("sex = " + wolfOne.getSex());
		System.out.println("nickname = " + wolfOne.getNickname());
		System.out.println("weight = " + wolfOne.getWeight());
		System.out.println("age = " + wolfOne.getAge());
		System.out.println("color = " + wolfOne.getColor());
		
		wolfOne.go();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}