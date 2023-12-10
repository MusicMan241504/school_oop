package inheritance;

public class Main {

	public static void main(String[] args) {
		Vehicle myVehicle = new Vehicle("bus");
		System.out.println(myVehicle.getName());
		
		Car myCar = new Car("blue car", 4);
		System.out.println(myCar.getName());
		System.out.println(myCar.getSeats());
	}

}
