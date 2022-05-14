package variables;

public class Globalvariable2 {
	static double salary=45000; // static global variable or class variable.


	public static void main(String[] args) {
		System.out.println("salary:"+ Globalvariable2.salary); //standard way to access SGV
		System.out.println(salary);                             //Direct way to access SGV (but static to static)
		
		
		

	}

}
