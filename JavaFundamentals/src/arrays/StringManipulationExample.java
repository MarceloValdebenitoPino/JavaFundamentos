package arrays;

public class StringManipulationExample {
	
	public static void main(String[] args) {
		
		// Using String Literal
		String str1 = "Hello ";
		System.out.println(str1);
		
		// Using string Object
		String str2 = new String("World");
		System.out.println(str2);
		
		//Concatenating String Literal and String Object
		String str3 = str1 + str2;
		System.out.println(str3);
		
		// String Method
		System.out.println(str3.length());
		System.out.println(str3.charAt(0));
		System.out.println(str3.concat(str2));
		System.out.println(str3.substring(0, 5));
		System.out.println(str3.equals(str2));
		System.out.println(str3.contains("Hello"));
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		System.out.println(str3.trim());
		
	}

}
