package overriding;
  // Base class or parent class or Super class.
 class parent{
	 void show() {
		 System.out.println("I am Method of parent class");
	 }
 }
 // Inherited class or child class or Sub class.
class child extends parent{
	void show() {
		System.out.println("Overrid Metod");
		super.show();
	}
}

// Driver Class
public class Overriding5 {

	public static void main(String[] args) {
		parent p=new parent();// If a Parent type reference refers to a Parent object, then Parent's show() is called
		p.show();  //parent show()
		// If a Parent type reference refers to a Child object Child's show() is called. This is called RUN TIME
				// POLYMORPHISM.
		parent p1=new child();
		p1.show();  //child show()
		

	}

}
