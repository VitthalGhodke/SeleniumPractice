package loops;

public class Whileloop1 {

	public static void mainln(String[] args) {
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
	}
}
