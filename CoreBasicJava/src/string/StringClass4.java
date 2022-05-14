package string;

public class StringClass4 {

	public static void main(String[] args) {
	StringClass4 s1=new StringClass4();
	System.out.println(s1);//String representation of object
	System.out.println(s1.toString());//String representation of object
	System.out.println(s1.hashCode());//String representation of object is converted into decimal number
	
	String s2="Komal";
	String s3="Komal";
	String s4=new String ("komal");
	String s5=new String("komal");
	
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	
	System.out.println(s2.equals(s3));//t  inside the string .equals() compair the object based on value
	System.out.println(s2==s3);//t  inside the string == compair the object based on address
	
	System.out.println(s4.equals(s5));//t
	System.out.println(s4==s5);//f
	
	System.out.println(s2.length());
	System.out.println(s2.indexOf("m"));
	System.out.println(s2.concat(s3));
	System.out.println(s2+s4);
	
	
	}

}
