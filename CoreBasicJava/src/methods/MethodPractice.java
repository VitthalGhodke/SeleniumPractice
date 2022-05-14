package methods;

public class MethodPractice {
	 double getIrate(int p, double r, int t) {
		return (p*r*t)/100;
	}
	 static int area(int A, int B) {
		 return(A*B);
   }
	 public static void me(int age, double salary) {
		 System.out.println(age+ "  " +salary);
	 }
	  int addres(int num1, int num2) {
	  int res2=num1+num2;
		return res2;
	 }
	  //methodOverloading
	  int getnum() {
		  return 10;
	  }
	  void display() {
		  char grade ='a';
		  int age=25;
		  double salary=68000.35;
		  System.out.println("zero parameter ()");
		  System.out.println("Grade:"+ grade);
		  System.out.println("Age:"+age);
		  System.out.println("Salary:"+ salary);
     }
	  void display(int age) {
		  System.out.println("int parameter ()");
		 
		  System.out.println("Age:"+age);
		 
	  }
	  void display(char grade,int age) {
		  System.out.println("char int parameter ()");
		  System.out.println("Grade:"+ grade);
		  System.out.println("Age:"+age);
		  
	  }
	  void display(double salary,int age,char grade) {
		  System.out.println("double int char parameter ()");
		  System.out.println("Salary:"+ salary);
		  System.out.println("Age:"+age);
		  System.out.println("Grade:"+ grade);
		 
		  
	  }
	 

	public static void main(String[] args) {
		MethodPractice m=new MethodPractice ();
		
		double res=m.getIrate(400,2.2,200);
		System.out.println(res);
		
		int res1=area(10,10);
		System.out.println(res1);
		me(26,80000.20);
		me(30,90000.20);
		me(21,230000.20);
		
		int sum=m.addres(55,50);
		System.out.println(sum);
		m.display();
		m.display(40);
		m.display('d', 50);
		m.display(91000, 28, 'm');
	}

}
