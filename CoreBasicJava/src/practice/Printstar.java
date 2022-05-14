package practice;

public class Printstar {
	
	
	public static void main(String[] args) {
		printStar();
		revprintStar();
		
	}
	static void printStar() {
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void revprintStar() {
		for(int i=5;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
