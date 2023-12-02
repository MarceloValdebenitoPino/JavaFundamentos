package polymorphism;

class Student {
	
	//Data Members
	private int studentId;
	private String studentName;
	private int studentAge;
	
	public Student() {
		studentId = 100;
		studentName = "Unknown";
		studentAge = 18;
	}
	
	public Student(int studentId, String studentName, int studentAge) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;		
	}
	
	void displayDetails() {
		System.out.println("Student Id : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Age : " + studentAge);
	}
	
}


public class ConstructorOverloadingExample {

	public static void main(String[] args) {

		Student student = new Student();
		student.displayDetails();
		
		System.out.println("************************");
		
		Student student1 = new Student(101, "Karthik", 23);
		student.displayDetails();
		
		System.out.println("************************");
		
		Student student2 = new Student(101, "Srheya", 32);
		student2.displayDetails();
	}

}
