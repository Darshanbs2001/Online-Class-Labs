package Polymorphism;

class Student {
	private String name;
	private int age;
	private String department;

	public Student(String name, int age, String department) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
	}

	public Student() {
		this.name = "Unknown";
		this.age = 20;
		this.department = "Unassigned";
	}

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
		Student s1=new Student();
		Student s2=new Student("Darshan B S",23);
		Student s3=new Student("Vinay B S",24,"Sales");
		System.out.println("Student-1 details: ");
		System.out.println("Name: "+s1.getName());
		System.out.println("Age: "+s1.getAge());
		System.out.println("Department: "+s1.getDepartment());
		System.out.println("Student-2 details: ");
		System.out.println("Name: "+s2.getName());
		System.out.println("Age: "+s2.getAge());
		System.out.println("Department: "+s2.getDepartment());
		System.out.println("Student-3 details: ");
		System.out.println("Name: "+s3.getName());
		System.out.println("Age: "+s3.getAge());
		System.out.println("Department: "+s3.getDepartment());

	}
}
