package conditons;

public class Ifelsecondition {

	public static void main(String[] args) {
	 int num1=45, num2=30;
	 if (!(num1==num2)) { //(num1!=num2)
		 System.out.println("Numkber1 is greater than number2");
	 }else {
		 System.out.println("Number 1 is smaller than number2");
	 }
	 if (num1>num2) {
		 System.out.println("'Number 1 is Greater than number 2");
		 
	 }else{
		 System.out.println("Number 1 is smaller than number 2");
	 }
	 if (num1>=num2) {
		System.out.println("num1 is either equal to num2 or greater than num2"); 
	 }else {
		 System.out.println("num1 is smaller than num2");
	 }
	 if(num1==num2 || num1>num2) {
       System.out.println("num1 is either equal to num2 or greater than num2");
	 }else {
		 System.out.println("num1 is smaller than num2");
	 }
	 if (num1>=num2 && num1>num2) {
		 System.out.println("num1 is either equal to num2 or greater than num2");
	 }else {
		 System.out.println("num1 is smaller than num2");
		 if(num1==num2) {
			 System.out.println("num1 is equal to num2");
		 }else if(num1 <num2) {
			 System.out.println("num1 is smaller than num2");
		 }else {
			 System.out.println("num1 is greater than num2");
		 }
		 
	 }
	}

}
