package assignment;

public class assignmentOnReverseString {

	public static void main(String[] args) {
		String S="Testing";
		System.out.println(S);
		//Print the string by using for loop
		System.out.println("Print the string by using for loop");
		for(int i=0;i<S.length();i++) {
			System.out.println(S.charAt(i));
		}
		// Revers String by using for loop
		System.out.println("Print the Revers String by using for loop");
		for(int i=S.length()-1;i>=0;i--) {
			System.out.println(S.charAt(i));
		}
		//Palindrom number
		System.out.println("Palindrom number");
		 String s1="151";
	     String s2="";
		 
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
			}
		System.out.println(s2);
		if(s1.equals(s2)) {
			System.out.println("Strung is Palindrom");
		}else {
			System.out.println("Normal String");
		}
//Number is Prime or not
		int num= 7;
		int check =0;
		if (num==0 || num==1 ) {
			System.out.println("no prime no " +num);
		}		else {
			for (int i = 2; i<= num/2; i++) {
				if(num%i==0) {
					System.out.println("no prime no "+num);
					check=1;
					break;
				}
			}
			if(check==0) {
				System.out.println("its prime no ="+num);
			}
		}
	}
}
	

	 
		
	


