package bluestack;

import java.util.Date;

public class Starter {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Nikhil", new Date(2021, 11, 25));
		Employee e2 = new Employee(2, "Chiranjeeb", new Date(2022, 6, 14));
		
		System.out.println(e1);
		e1.getDob().setMonth(0);
		// If it prints same it means employee is an immutable class
		System.out.println(e1);
	}

}
