package students;

public class Student {
	private String name;
	private int age;
	private Character grade;

	public Student(String name, int age, Character grade) {
		this.setName(name);
		this.setAge(age);
		this.setGrade(grade);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		}
	}

	public Character getGrade() {
		return grade;
	}

	public void setGrade(Character grade) {
		if (Character.isLetter(grade)) {
		this.grade = Character.toUpperCase(grade);
		}
	}
	
	public void printAll() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(grade);
	}
	
	public boolean isTeenager() {
		if (age >= 13 && age <= 19) {
			return true;
		} else {
			return false;
		}
	}

}
