package methodoverloading;

public class MethodOverloading1 {
	
	public static void Shine() {
		System.out.println("No parameter MEthod Shine");
	}
	public static void Shine(int a) {
		int res=a*a;
		System.out.println(res);
	}
	public static void Shine(double d) {
		double res1=d+d;
				
		System.out.println(res1);
	}
	public static void Shine(char k) {
		System.out.println(k);
		
	}
	
   void Shine1() {
	   System.out.println("I am Shine1");
		
	}
   void Shine1(double b , double m) {
	   double res=b*m;
	   System.out.println(res);
   }

	public static void main(String[] args) {
	Shine();
	Shine(12);
	Shine(23.5);
	Shine('V');
	MethodOverloading1 k1=new MethodOverloading1();
	k1.Shine1();
	k1.Shine1(23.5, 16.23);
	

	}

}
