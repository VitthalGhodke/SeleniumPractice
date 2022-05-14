package conditons;

public class Ifprimenumber {

	public static void main(String[] args) {
//		int num=11;
//		if(num!=0 || num!=1 || num==2) {//logic wrong
//			System.out.println("not a prime number : "+num);
//		}else if(num%num==0 ) {
//			System.out.println("Number is prime: "+num);
//		}else {
//			System.out.println();
//		}
		int num=17;
		if(num==0 || num==1) {   //logic wrong
			System.out.println("not a prime number : "+num);
		}else if(num%num==0 ) {
			System.out.println("Number is prime: "+num);
		}else {
			System.out.println();
		}
	}
}