package string;
public class Example1 {
	public static void main(String[] args) {
		Example1 obj = new Example1 ();
		obj.demo();
	}
	public void demo() {
		String str = "Vitthal"; //by using Literals
		String str1 = "vitthal";
		String str2 = new String ("Vitthal");//using new keyword
		String str3 = new String ("vitthal");
		
		System.out.println(str==str1); //
		System.out.println(str==str2);
		System.out.println(str.equals(str1)); //f 
		System.out.println(str.equals(str2)); // 
		System.out.println(str2==str3); // 
		System.out.println(str2.equals(str3)); // 
		System.out.println(str.equalsIgnoreCase(str1));//
		System.out.println(str.length());
		System.out.println(str.substring(5));
		System.out.println(str.substring(1));
		System.out.println(str.substring(2, 5));
		System.out.println(str.charAt(4));
		
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}
	}
}
/*
 * String ===== Literal => String str = "";
 * 				By New Keyword => String str = new String("---");
 *  == operator => Compaire two object based on its address
 *  .equal() => Compaire two object based on its Value
 *  .equalIgbnoreCase() => check contenet of string only even samll or capital
 */
 