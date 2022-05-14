package practice;

public class efElse1 {

	public static void main(String[] args) {
		int num1=23, num2=30;
		if(num1==num2) {
			System.out.println("Num1 is Equal to num2");
		}else {
			System.out.println("Num1 is not equal to num2");
		}
		if(num1<num2) {
			System.out.println("num1 is smsller than num2");
		}else{
			System.out.println("num2 is grether than num1");
		}
      if (num1>num2) {
    	  System.out.println("num2 is grether than num1");
      }else {
    	  System.out.println("num1 is smsller than num2");
      }
      if(num1==num2 || num1>num2) {
    	  System.out.println("num1 is smaller than num2");
      }else {
    	  System.out.println("***");
      }
      int sub1=50,sub2=30;
		if(sub1>35 && sub2>35) {
			System.out.println("pass....");
		}else {
			System.out.println("fail....");
		}
		int number=50;  
		//Check if the number is divisible by 2 or not  
		if(number%2==0){  
			System.out.println("even number");  
		}else{  
			System.out.println("odd number");  
		} 
		int year = 2020;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");
		} else {
			System.out.println("COMMON YEAR or NON LEAP YEAR");
		}
	}

}



















