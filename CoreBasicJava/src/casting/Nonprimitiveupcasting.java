package casting;
 class A1{
	 void step1() {
		 System.out.println("Running step1");
	 }
 }
class B1 extends A1{
	void step2() {
		System.out.println("Running step2");
	}
}
class C1 extends B1{
	void step3() {
		System.out.println("Running step 3");
	}
}
public class Nonprimitiveupcasting {

	public static void main(String[] args) {
		System.out.println("Program starts");
       C1 k=new C1();//Access all class because c1 inherit b1 & b1 inherit A1.
       k.step1();
       k.step2();
       k.step3();
       System.out.println("Derived or non-primitive casting");
       B1 v=new C1();  //            parent class access <---B1 v=new C1();--->child class object
       v.step2();
       v.step1();
       
       A1 a=new C1();
       a.step1();
       
       C1 k1=new C1();
       B1 k2=k1;   //implicit upcasting
       k2.step1();
       k2.step2();
       B1 k3=(B1)k1;//explicit upcasting
       k3.step1();
       k3.step2();
       A1 k4=k1;
       k4.step1();
      
     
     
       
       
	}

}
