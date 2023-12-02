package basics;

public class TypeCastingExample {
	
	public static void main(String[] args) {
		
		/*
		int intValue = 100;		
		//Implicit Type Casting from int to long
		long longValue = intValue;
		
		//Implicit Type Casting from long to double
		double doubleValue = longValue;
		System.out.println(intValue);
		System.out.println(longValue);
		System.out.println(doubleValue);
		*/
		
		double doubleValue = 200.56;
		
		//Explicit Type Casting from double to int
		int intValue = (int)doubleValue;
		
		//Explicit Type Casting from int to byte
		byte byteValue = (byte)intValue;
		
		System.out.println(doubleValue);
		System.out.println(intValue);
		System.out.println(byteValue);
		
	}

}
