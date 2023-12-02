package inheritance;

import java.util.Scanner;

class Student {
	
	//Data Members
	private int studentId;
	private String studentName;
	private int studentAge;
	Scanner scanner = new Scanner(System.in);
	
	// Member Function
	void acceptDetails() {
		System.out.print("Enter Student Id : ");
		studentId = scanner.nextInt();
		System.out.print("Enter Student Name : ");
		studentName = scanner.next();
		System.out.print("Enter Student Age : ");
		studentAge = scanner.nextInt();
	}
	
	void displayDetails() {
		System.out.println("Student Id : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Age : " + studentAge);
	}
	
}

class Marks extends Student {
	protected float objectiveMarks;
	protected float subjectiveMarks;
	void acceptDetails() {
		super.acceptDetails();
		System.out.print("Enter Objective Marks : ");
		objectiveMarks = scanner.nextFloat();
		System.out.print("Enter Subjective Marks : ");
		subjectiveMarks = scanner.nextFloat();
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("Objective Marks : " + objectiveMarks);
		System.out.println("Subjective Marks : " + subjectiveMarks);
	
	}
}

class Sports extends Marks {
	protected float score;
	void acceptDetails() {
		super.acceptDetails();
		System.out.print("Enter Sports Score : ");
		score = scanner.nextFloat();
		
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("Sports Score : " + score);
	
	}
}

class Result extends Sports {
	private float totalMarks, averageMarks;
	void calculate() {
		totalMarks = objectiveMarks + subjectiveMarks + score;
		averageMarks = totalMarks / 3;
		System.out.println("Total Marks : " + totalMarks);
		System.out.println("Average Marks : " + averageMarks);
	}
	
}
public class InheritanceExample {

	public static void main(String[] args) {
		
		Result obj = new Result();
		obj.acceptDetails();
		obj.displayDetails();
		obj.calculate();
		
		
	}

}
