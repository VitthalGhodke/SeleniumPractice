package inheritance;

class A1{
	static int a=32;
	int b=23;
	double c=16.23;
}
 class B1 extends A1{
	 static int m=55;
	 int n=23;
	 double o=66.23;
 }
 class C1 extends B1{
	 static int x=90;
	 int y=33;
	 double z=45.23;
	 
 }

public class Inheritance1 {

	public static void main(String[] args) {
		//Access of static member of all classes
		System.out.println("I am a static member of class A1:"+A1.a);
		System.out.println(" ");
		System.out.println("I am a static member of class B1:"+B1.m);
		System.out.println(" ");
		System.out.println("I am a ststic member of class C1:"+C1.x);
		System.out.println(" ");
		System.out.println(A1.a+" :"+B1.m+" :"+C1.x);
		System.out.println(" ");
		//Access of non-static member of class A1,B1 &C1
		 C1 c1=new C1(); // it will have all the non static member of class A1, B1 & C1-- b, c, n, o, y, z.
		 System.out.println("Refer Class C1 :"+c1.b+" :" +c1.c+" :"+c1.n+" :"+c1.o+" :"+c1.y+" :"+c1.z);
		 System.out.println(" ");
		 
		 B1 b1=new B1();// it will have all the non static member of class A1& B1-- b,c & n,o.
		 System.out.println("Refer class B1 :"+b1.b+" :"+b1.c+" :"+b1.n+" :"+b1.o);
		 System.out.println(" ");
		 
		 A1 a1=new A1();
		 System.out.println("Refer class A1 :"+a1.b+" :"+a1.c);
		 
		 
	}

}
/* Inheritance--> 
 *             when a child class inherit the property of its parents class known as inheritance.
 *              Representation:
 *                       class childclassname extends parentsclassname{
 *                       }
 *     inheritance achived by using Super () statement 
 *                                              -->used to call parent/super class constructor based on parameter
 *                                              -->super()should be the first statement inside the constructor body
 *    Note: Inheritance involves only non-static member.
 *      super() & this() can't be written together                                                                      
 */
