package string;

public class StringClass5 {

	public static void main(String[] args) {
		StringClass5 Q=new StringClass5();
		System.out.println(Q);//String Representation
		System.out.println(Q.toString());//String Representation
		System.out.println(Q.hashCode());//String Representation is Converted into Decimle no.
		
		String v="Vitthal";
		System.out.println(v);
	
	String str="KHADAKAWADI";
	System.out.println(str.length());
	char c=str.charAt(0);
	
	System.out.println(c);
	System.out.println("print one by one character using For loop");
	for(int i=0;i<str.length();i++) {
		System.out.println(str.charAt(i));
	}
	System.out.println("print one by one character from last inde");
  for(int i=str.length()-1;i>=0;i--) {
	  System.out.print(str.charAt(i));
	 
  }
  System.out.println();
  String temp = ""; 
	for (int i = str.length() - 1; i >= 0; i--) {
		temp = temp + str.charAt(i);
	}
	System.out.println("str1: " + str);
	System.out.println("temp: " + temp);
	
	}

}
