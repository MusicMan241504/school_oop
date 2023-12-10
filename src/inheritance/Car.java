package inheritance;

public class Car extends Vehicle{
	private int seats;

	public Car(String name, int seats) {
		super(name);
		this.seats = seats;
	}
	
	public int getSeats() {
		return seats;
	}

}
