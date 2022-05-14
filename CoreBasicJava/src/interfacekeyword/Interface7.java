package interfacekeyword;
 interface Animal1{
	 double Salary=50200;
	 int age=25;
	 void sound();     // interface method (does not have a body)
	 void sleep();        // interface method (does not have a body)
	 
 }
 
 interface Cat{
	 float F=20.2f;
	 int age=22;
	 void maw();     // interface method (does not have a body)
	 
 }
 class Dog1 implements Animal1{
	 public void sound() {
		 System.out.println("Animal Sound Method");
	 }
	 public void sleep() {
		 System.out.println("Animal sleep method");
	 }
 }
class pig extends Dog1 implements Cat,Animal{
	public void maw() {
		System.out.println("Cat method maw");
	}
}

public class Interface7 {

	public static void main(String[] args) {
	pig g=new pig();
	g.sound();
	g.sleep();
	g.maw();

	}

}
