package abstractClass;

abstract class Demo {
	abstract void print();// Abstract method/incomplete method
							

	void Display() {    // Regular or normal or non-abstract or concret or complete method
		System.out.println("I am a non abstract method Display() For Demo");
	}

}

abstract class Demo1 {
	void Display() {
		System.out.println("I am a non abstract method Display() For Demo1");
	}

	void Display1() {
		System.out.println("I am a non abstract method Display1() For Demo1");
	}
}
 
 abstract class Demo2{
	 abstract void print();
	 abstract void print1();
	 abstract void print2();
 }
public class AbstractClass0 {

	public static void main(String[] args) {
	
		

	}

}
/**
 * class declared with Abstract keyword known as abstract class, 0 to 100% abstract
 * it will have
 * 			- abstract method ----> method declared with abstract keyword without body
 * 			- non-abstract method --> normal method/concrete method
 * 			- constructor
 *  		- static method
 *  		- global variable
 *  Abstract class object can't be create as its incomplete class
 *  
 *  if any class contains even one abstract method dn that class should be declared as abstract class
 *  
 *  when an abstract class is getting inherited by a sub class, dn there will a contract between these classes thats
 *  subclass needs to override all the abstract method of abstract class(super class) otherwise subclass becomes
 *  abstract class
 */ 