package consrtuctors;
class A{
	int i=5;
	A(){
		System.out.println("I am Cons A"); 
	}
	void display() {
		System.out.println("I am A displat() of ConsA");
	}
}
 class B{
	 int j=50;
	 B() {
		 System.out.println("I am Cons of B");
	
		 }
	 void display() {
		 System.out.println("I am display () of cons B");
	 }
 }

 

public class Cons5 {

	public static void main(String[] args) {
		A k1=new A();
		k1.display();
		System.out.println(k1.i);
		B k2=new B();
		k2.display();
		System.out.println(k2.j);

	}

}
