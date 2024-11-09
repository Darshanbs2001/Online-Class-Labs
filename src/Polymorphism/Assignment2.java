package Polymorphism;
//create student with the following properities

//name, age, department

class Student {
	private String name;
	private int age;
	private String department;

	// all aruguments constructor for
	// initializing all the properities of the student
	// with the user provided values
	public Student(String name, int age, String department) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
	}

//default constructor
//to initialize the object properities to
	// default values
	public Student() {
		this.name = "Unknown";
		this.age = 20;
		this.department = "Unassigned";
	}
	//parameterised constructor with two arguements
	//to initialize the objects with just two values
	//name and age and department to IT
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.department = "IT";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDepartment() {
		return department;
	}

}

public class Assignment2 {
	public static void main(String[] args) {
		Student s1 = new Student();//create the object with default values
		//create the object with passing only name and age
		Student s2 = new Student("Darshan B S", 23);
		//create the object with passing all the arugements values
		Student s3 = new Student("Vinay B S", 24, "Sales");
		//print the student 1 details
		System.out.println("Student-1 details: ");
		System.out.println("Name: " + s1.getName());
		System.out.println("Age: " + s1.getAge());
		System.out.println("Department: " + s1.getDepartment());
		//print the student 2 details
		System.out.println("Student-2 details: ");
		System.out.println("Name: " + s2.getName());
		System.out.println("Age: " + s2.getAge());
		System.out.println("Department: " + s2.getDepartment());
		//print the student 3 details
		System.out.println("Student-3 details: ");
		System.out.println("Name: " + s3.getName());
		System.out.println("Age: " + s3.getAge());
		System.out.println("Department: " + s3.getDepartment());

	}
}
