package systemClass;
import java.util.Scanner;
public class ScannerClass1 {

	public static void main(String[] args) {
		// Object creation of Scanner class
				Scanner s1 = new Scanner(System.in);
			
				int age;
				double salary;
				String name;
				boolean valid;

				/* Initialization of variable using Scanner class */
				System.out.println("Enter age value from console");
				age = s1.nextInt();
				System.out.println("Enter salary value from console");
				salary = s1.nextDouble();
				System.out.println("Enter name value from console");
				name = s1.next();
				System.out.println("Enter true/false value from console");
				valid = s1.nextBoolean();
				System.out.println("age: " + age);
				System.out.println("salary: " + salary);
				System.out.println("name: " + name);
				System.out.println("valid: " + valid);
	}
	
}
