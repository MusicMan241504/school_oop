package monster_quest;

public class Monster {
	private String name;
	private int health;
	private String text;

	public Monster(String name, int health, String text) {
		this.setName(name);
		this.setHealth(health);
		this.setText(text);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public void damage(int damage) {
		this.setHealth(this.getHealth()-damage);
	}
	
	public void speak() {
		System.out.println(getText());
	}
	
}
