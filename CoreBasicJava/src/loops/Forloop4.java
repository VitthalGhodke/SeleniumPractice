package loops;

public class Forloop4 {

	public static void main(String[] args) {
		for(int i=0; i<10;i++) {
			System.out.println(i);
			i=i+1;
		}
		System.out.println("******Even Number********");
		for (int i=1; i<50;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("******Odd Number********");
		for (int i=1; i<50;i++) {
			if(!(i%2==0)) {
				System.out.println(i);
			}
		}
		System.out.println("******Odd Number in revers********");
		for (int i=50; i>1;i--) {
			if(!(i%2==0)) {
				System.out.println(i);
			}
		}
		System.out.println("******Even Number in revers********");
		for (int i=50; i>1;i--) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
