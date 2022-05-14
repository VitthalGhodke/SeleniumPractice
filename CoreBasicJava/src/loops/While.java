package loops;

public class While {

	public static void main(String[] args) {
		System.out.println("******A to z***********");
		char c1='a';
		while (c1<='z') {
			System.out.println(c1);
			c1++;
		}
		System.out.println("******Revers Z to A***********");
		char c2='z';
		while (c2 >='a') {
			System.out.println(c2);
			c2--;
			
		}
		int k=1;
		while(k<=5) {
			System.out.println(k);
			k++;
		}
		int k1=5;
		while(k1>=1) {
			System.out.println(k1);
			k1--;
			
		}

	}

}
