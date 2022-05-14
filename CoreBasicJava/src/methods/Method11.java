package methods;

public class Method11 {
 public	 void MyDetails1(int age, double Salary) {  //static method
		System.out.println("My name is Vitthal");
		System.out.println("I am From Pune");
	
	System.out.println("I am "+age+" year old");
	System.out.println("My Salary is:"+Salary);
 }
	public static double getInterest(int p,double r,int t) {
		return (p*r*t)/100;
		
	}
	

	public static void main(String[] args) {
	 
	 Method11 h=new Method11();
	 h.MyDetails1(26,90000.550);
	 h.MyDetails1(12,15.65);
	 System.out.println (getInterest(40000,5.5,50));
	 System.out.println (getInterest(58000,6.5,60));
	 

	}

}
