package interfacekeyword;

interface Printable {
	int age=50;//by default public static final
	void print();//by default public abstract
}
interface Showable {
	int age=60;
	public void show();
	
}
public class Interface3 implements Printable, Showable {
	public static int age=40;//by default---> public static final 
	public void print() {
		System.out.println("Hello, print");
	}
	public void show() {
		System.out.println("Welcome, show");
	}
	
		
	
	
	public static void main(String args[]) {
		Interface3 i = new Interface3();
		i.print();
		i.show();
		System.out.println(Printable.age);
		System.out.println(Interface3.age);
		System.out.println(Showable.age);
	}
}