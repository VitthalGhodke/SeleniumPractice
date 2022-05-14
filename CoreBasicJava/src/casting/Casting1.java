package casting;

  class vitthal{
	  void v1(double d) {
		  System.out.println(d);
		  
	  }
	  void v2(int i) {
		  System.out.println(i);
		  double i1=(double)i;
		  System.out.println(i1);
	  }
	  
  }

public class Casting1 {

	public static void main(String[] args) {
		System.out.println("program strats");
		vitthal v=new vitthal();
		v.v1(32.23);
		
		v.v2(5);
			
		

	}

}
