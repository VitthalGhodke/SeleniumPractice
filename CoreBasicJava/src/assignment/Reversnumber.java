package assignment;

public class Reversnumber {

	public static void main(String[] args) {
		int num=1234, rev=0, rem=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			}
		System.out.println("Revers number;"+ rev);
		
      
	}

}
