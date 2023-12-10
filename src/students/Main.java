package students;

public class Main {


	public static void main(String[] args) {
		Student student = new Student("john", 16, 'a');
		student.printAll();
		System.out.println(student.isTeenager());
	}

}
