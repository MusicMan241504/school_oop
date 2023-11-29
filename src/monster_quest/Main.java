package monster_quest;

public class Main {

	public static void main(String[] args) {
		Monster x = new Monster("Bob", 10, "Hi");
		x.damage(2);
		System.out.println(x.getHealth());
		x.speak();
	}

}
