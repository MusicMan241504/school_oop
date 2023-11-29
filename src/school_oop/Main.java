package school_oop;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<Pet> pets = new LinkedList<Pet>();
		pets.add(new Pet("Fluffy", "Cat", "Evil"));
		pets.add(new Pet("Tdllies", "Tiger", "STripey"));
		for (Pet obj : pets) {
			System.out.println(obj.name);
			System.out.println(obj.getSpecies());
			System.out.println(obj.getDescription());
		}
	}

}
;