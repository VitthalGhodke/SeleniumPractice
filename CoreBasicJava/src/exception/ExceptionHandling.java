package exception;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		//abnormal statement
		int i,j, k;
     
		Scanner s=new Scanner(System.in);
		System.out.println(s);
		try {
			System.out.println("Enter num1");
			i=s.nextInt();
			System.out.println("enter num2");
			j=s.nextInt();
			
			k=i/j;
			System.out.println("Result:"+k);
			
			}catch(ArithmeticException v) {
				System.out.println("Exception handled"+v);
				}
		System.out.println("Program end...");
	}

}
/**
1. try ---> throws some exeception -----> catch() has to catch it
2. try ---> throws some exeception -----> catch() donesn't that type of declaration dn jvm will terminate the program execution
3. try ---> doesn't have any exception -----> dn catch block will not be executed
*/