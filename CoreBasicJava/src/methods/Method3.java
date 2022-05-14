package methods;

public class Method3 {
	public static void printDetails(int age, int salary) {

		System.out.println("I am "+age+" yrs old");
		System.out.println("My Salary is "+salary);
		
		//return;//optional because if you don't write it then  java compiler will write it(this is only for void return type)
	}

	public static void main(String[] args) {
		System.out.println("Program Strats");
		System.out.println("age:");
				
	  printDetails(30,25000);
		
	  printDetails(35,35000);
	  
	  printDetails(40,400000);
	  
	  printDetails(50,665000);
		

	}

}
