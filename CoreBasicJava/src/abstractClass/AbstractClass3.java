package abstractClass;
 
  abstract class RBI{
	  abstract double interestonhomeloan();       //abstract mean must be overridden
		                                         //final means can't be override
	  final void loan() {
		  System.out.println("As per RBI loan");
	  }
  }
class SBI extends RBI{
	double interestonhomeloan() {
		return 7.3;
	}
}

class PNB extends RBI{
	double interestonhomeloan() {
		return 6.6;
		
	}
}
public class AbstractClass3 {

	public static void main(String[] args) {
		PNB p1=new PNB();
	  System.out.println("PNB Rate of Interest is:"+p1.interestonhomeloan()+"%");
	  p1.loan();
        SBI b1=new SBI();
        System.out.println("SBI  Rate of Interest is:"+b1.interestonhomeloan()+"%"); 
        b1.loan();
        
        System.out.println("***********************************");
        RBI p2 = new PNB();
		System.out.println("RBI reference but object of PNB, Rate of Interest is: " + p2.interestonhomeloan() + " %");	
        RBI b2 = new SBI();
		System.out.println("RBI reference but object of SBI, Rate of Interest is: " + b2.interestonhomeloan() + " %");
		
		
		
	}

}
