package gift_system;

public class Gift {
	private String name;
	private String recipient;
	private double price;
	private boolean purchased;
	
	public Gift(String name, String recipient, double price, boolean purchased) {
		this.name = name;
		this.recipient = recipient;
		this.price = price;
		this.purchased = purchased;
	}
	

	public String getName() {
		return name;
	}
	
	public String getRecipient() {
		return recipient;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean getPurchased() {
		return purchased;
	}
}
