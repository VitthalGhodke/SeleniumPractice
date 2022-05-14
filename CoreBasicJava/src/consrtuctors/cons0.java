package consrtuctors;

public class cons0 {
	  int age=10;
	public static void main(String[] args) {
	
		System.out.println("program starts");
		cons0 c1=new cons0();
		System.out.println(c1.age);
		System.out.println("program end");
	}

}
/*
 * constructor is used to initialize instance member of the class, constructor is similar to method but,
 *  1. constructor name should be same as class name 
 *  2. constructor doesn't have return type and also not returns any value
	3. constructor gets called automatically when an instance/object of a class is created
	4. being a programmer we can't call/executed constructor based on our requirement
	5. constructor are 2 types
		a. default constructor : written by java compiler with empty body
		b. user defined constructor : written by programmer
			i. zero parameterized constructor
			ii. parameterized constructor		 
 * 
 */
