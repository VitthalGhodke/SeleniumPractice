package interfacekeyword;
interface Bank{
	float rateOfInterest();
	
}
class SBI implements Bank{
	public float rateOfInterest(){
		return 5.6f;
	}
}
class PNB implements Bank{
	public float rateOfInterest() {
		return 6.1f;
	}
}

public class Intreface2 {

	public static void main(String[] args) {
		SBI b1=new SBI();
		System.out.println("SBI Rate of interest:"+b1.rateOfInterest());
		PNB p1=new PNB();
		System.out.println("PNB Rate of interest:"+p1.rateOfInterest());
        Bank b2=new SBI();
       System.out.println( b2.rateOfInterest());
       Bank b3=new PNB();
       System.out.println(b3.rateOfInterest());
	}

}
