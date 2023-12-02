package basics;

import java.util.Scanner;

public class ReadingInputFromUserExample {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Your Ager: ");
		int age = scanner.nextInt();
		System.out.print("Enter Yoour Gender(M/F) : ");
		char gender = scanner.next().charAt(0);
		System.out.print("Enter your Contact Number");
		double contact = scanner.nextDouble();
		
		System.out.println("User Details: ");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
		System.out.println("Contact Number : " + contact);
	}

}
