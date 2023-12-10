package gift_system;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static LinkedList<User> users = new LinkedList<User>();
	
	public static void addUser(String name) {
		users.add(new User(name));
	}
	
	public static void addGift(String userName, String name, String recipient, double price, boolean purchased) {
		for (User user : users) {
			if (user.getName().equals(userName)) {
				user.addGift(new Gift(name, recipient, price, purchased));
			}
		}
	}
	
	public static void printGifts(String userName) {
		for (User user : users) {
			if (user.getName().equals(userName)) {
				for (Gift gift : user.getGifts() ) {
					System.out.println(gift.getName());
					System.out.println(gift.getRecipient());
					System.out.println(gift.getPrice());
					System.out.println(gift.getPurchased());
				}
			}
		}
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		addUser("bob");
		addGift("bob", "PC", "jim", 999.99, false);
		
		
		String input = "";
		while (input != "exit") {
			System.out.println("Commands:\nPress u to add new user\nPress g to add new gift\nPress v to view gifts\n");
			input = scanner.nextLine();
			
			// add user
			if (input.equals("u")) {
				System.out.println("Enter user name: ");
				input = scanner.nextLine();
				addUser(input);
			} else if (input.equals("g")) {
				System.out.println("Enter user name: ");
				String userName = scanner.nextLine();
				System.out.println("Enter gift name: ");
				String gift = scanner.nextLine();
				System.out.println("Enter recipient: ");
				String recipient = scanner.nextLine();
				System.out.println("Enter price: ");
				double price = Double.parseDouble(scanner.nextLine());
				System.out.println("Is purchased (y/n): ");
				input = scanner.nextLine();
				boolean isPurchased = false;
				if (input.equals("y")) {
					isPurchased = true;
				}
				addGift(userName, gift, recipient, price, isPurchased);
			} else if (input.equals("v")) {
				System.out.println("Enter user name: ");
				printGifts(scanner.nextLine());
			}
		}
		
		
		System.out.println(users.get(0).getGifts());
		
		scanner.close();
	}

}
