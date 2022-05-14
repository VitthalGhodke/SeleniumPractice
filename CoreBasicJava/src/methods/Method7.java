package methods;

public class Method7 {

	static void getAdditionResult(double num1,double num2, int num3) {
		double res = num1+num2-num3;
		System.out.println("Result: "+res);
	}
		public static void main(String[] args) {
			getAdditionResult(25, 30 ,5);
			Method7.getAdditionResult(250.36, 45 ,6);
			Method7.getAdditionResult(250.36, 50, 7);
		}
		
		
	}


