package exception;

public class Exception1 {

	public static void main(String[] args) {
		//abnormal statement
		int i=10;
		int j=i/0; //ArithmeticException 
		System.out.println(i);
		System.out.println(j);
		
		//abnormal statement
		int[] k=new int[3];
		k[3]=120;       //Array Index OutOf  Bounds Exception 

	}

}
