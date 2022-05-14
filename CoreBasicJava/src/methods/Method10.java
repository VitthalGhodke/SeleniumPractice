package methods;

public class Method10 {

public double getInterest(int p, double r, int t) {     //non static method
return (p*r*t)/100;	
}

public double getInterest1(int p, double r, int t) {
	
	return (p*r*t)/100;
}
int getArea(int k, int l) {
	return (k*l);
	
}


	public static void main(String[] args) {
		  System.out.println("program strats");
		  Method10 m1=new Method10();         //Object for non static method
		  m1.getInterest(500, 5.2, 3);
	     double res= m1.getInterest(500, 5.2, 3);
		  System.out.println("Interest :"+ res);
		  double res1=m1.getInterest1(20, 2.2, 3);
		  int res2=m1.getArea(50,50);
		  
		  System.out.println("Interest1 :"+ res1);  
		  
		 System.out.println("Area:"+res2);		  
	}	  
}

