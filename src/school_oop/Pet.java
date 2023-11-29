package school_oop;

public class Pet {
	String name;
	private String species;
	private String description;
	
	public Pet(String name, String species, String description) {
		this.name = name;
		this.setSpecies(species);
		this.setDescription(description);
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
