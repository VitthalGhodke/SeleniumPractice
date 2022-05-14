package assignment;

public class FactorsofPositiveNegativenum {

	public static void main(String[] args) {
		System.out.print("Factors of positive number\n");
		int num=15;
		for (int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
				
			}
		}
		System.out.println("Factors of negative number\n");
		num=-15;
		for(int i=num;i<=Math.abs(num);++i) {
			if(i==0) {
				continue;
				
			}else {
				if(num%i==0) {
					System.out.print(i+" ,");
				}
			}
		}
	}

}
