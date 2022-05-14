package inheritance;
class A{
	static int a=10;
	int b=20;
	double c=13.20;
}
class B{
	static int x=12;
	int y=25;
	double z=23.23; 
}
class C{
	static int p=78;
	int q=88;
	double r=16.26;
}

public class Inheritance0 {

	public static void main(String[] args) {
		//Access static members of class A,B&C.---> a,x,p.
		System.out.println("I am a static member of class A:"+A.a);
		System.out.println("I am a static member of class B:"+B.x);
		System.out.println("I am a static member of class C:"+C.p);
 
		//Access non-static members of all classes
		A a1=new A();
		System.out.println("i'm a non-static member of class A:"+a1.b+" "+a1.c);
		B b1=new B();
		System.out.println("i'm a non-static member of class B:"+b1.y+" "+b1.z);
		C c1=new C();
		System.out.println("i'm a non-static member of class C:"+c1.q+" "+c1.r);
	}

}
