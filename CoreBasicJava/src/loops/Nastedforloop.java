package loops;

public class Nastedforloop {

	public static void main(String[] args) {
	System.out.println("*****Nasted For Loop*****");
	for(int i=0; i<10;i++) {
		for(int j=0;  j<=i;j++ ) {
			System.out.print("* ");
			
		}
		System.out.println();
	}
	System.out.println("*****Inverted Nasted For Loop*****");
	for(int i=0; i<10;i++) {
		for(int j=10;  j>=i;j-- ) {
			System.out.print("* ");
			
		}
		System.out.println();
	}
	}

}
