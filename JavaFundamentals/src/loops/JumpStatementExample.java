package loops;

import java.util.Scanner;

public class JumpStatementExample {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		String input = "";
		while(!input.equals("quit")) {
			System.out.println("Enter Message :");
			System.out.println(input);
			input = scanner.nextLine().toLowerCase();
			if(input.equals("quit"))
				break;
			if(input.equals("pass"))
				continue;
				System.out.println("Message : " + input);
		}
	}

}
