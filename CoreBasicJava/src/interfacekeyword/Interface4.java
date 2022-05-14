package interfacekeyword;
interface printable1{
	 double salary=50000;
	 void print1();
	 
}
interface Drawable1{
	int age=20;
	 void print1();
	void draw();
}

public class Interface4 implements printable1,Drawable {
	public void print1() {
		System.out.println("Hello print 1");
	}
	public void draw() {
		System.out.println("hello draw");
	}

	public static void main(String[] args) {
		Interface4 i1=new Interface4();
		i1.print1();
		i1.draw();
		System.out.println("Salary:"+printable1.salary);
		System.out.println("age:"+Drawable1.age);

	}

}
