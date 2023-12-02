package oops;

class Person {
	private String firsName;
	private String lastName;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 18)
			this.age = age;
		else
			System.out.println("Invalid Age");
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

public class EncapsulationExample {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.setFirsName("King");
		System.out.println(person.getFirsName());
		person.setLastName("Kocchar");
		System.out.println(person.getLastName());
		person.setAge(20);
		System.out.println(person.getAge());
		
	}

}
