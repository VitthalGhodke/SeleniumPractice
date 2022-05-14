package assignment;

public class Palindromenumber {

	public static void main(String[] args) {
		int num=151,rem,sum=0,temp=num;
		while(num>0) {
			rem=num%10; // 151%10=1(rem=1)--->15%10=5(rem=5)--->1%10=1 rem=1
			sum=sum*10+rem;//0*10+1=1(sum=1)--->1*10+5=15(sum=15)--->15*10+1=151 sum=151 temp==sum
			num=num/10; //151/10=15(num=15)--->15/10=1(num=1)--->1/10=0
			
		}
			if(temp==sum) {
				System.out.println("Palindrome number");
			}
			else {
				System.out.println("Not a palindrome number");
			}
	}

}
