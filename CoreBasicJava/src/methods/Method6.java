package methods;

public class Method6 {
	public static double getInterest(int p,double r,int t) {//p=250000, r=6.5, t=60
		return (p*r*t)/100;
	}
	public static void main(String[] args) {
		/**
		 *  res=(p*r*t)/100;
		 */
		System.out.println("Get interest using getInterest(): "+Method6.getInterest(25, 6.5, 6));
		
		System.out.println("**********************");
		double res=Method6.getInterest(25, 6.5, 6);
		System.out.println("res:"+res);
	}
	
	
	 
	

}
