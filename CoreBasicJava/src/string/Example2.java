package string;
public class Example2 {
	public static void main(String[] args) {
		Example2 obj = new Example2 ();
		obj.demo1();
	}
	public void demo1() {
		String ss = "NAYAN";
		//String s=ss;
		String rev="";
		for(int i=ss.length()-1; i>=0; i--) {
			rev= rev+ss.charAt(i);
		}
		System.out.println(rev);
		if(ss.equals(rev)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not Pallindrome");
		}
	}
}

 /*
  * Prime Number
  * Fibonacci Series
  * **Palindrome number/ String
  * **Reverse Number / String   ==> Vitthal -> lahttiV
  * Armstrong Number
  * Duplicate array / String
  * Second highest number in array
  * remove white spaces string
  * remove junk in string
  * word count in string 
  * character occarance in string 
  * Factorial Number.
  * Reverse string as a word ==> Hello vitthal -> vitthal Hello **** imp
  * 
  *    **Collection
  *    # HashMap
  */
  