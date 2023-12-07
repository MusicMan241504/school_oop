package gift_system;

import java.util.LinkedList;

public class User {
	private String name;
	private LinkedList<Gift> gifts = new LinkedList<Gift>();
	
	public User(String name) {
		this.name = name;
	}

	public void addGift(Gift gift) {
		gifts.add(gift);
	}
	
	public LinkedList<Gift> getGifts() {
		return gifts;
	}
	
	public String getName() {
		return name;
	}

}
