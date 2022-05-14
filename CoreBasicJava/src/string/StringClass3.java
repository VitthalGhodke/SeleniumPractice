package string;

public class StringClass3 {

	public static void main(String[] args) {
		String v1="CoreJavaBasics";  //Object creat using literal
		//or
		//String v1=new String("CreJavaBasic"); Object creat using new keyword
		System.out.println(v1.length());
		System.out.println("character at 3rd position:"+v1.charAt(2) ); //r
		System.out.println("Substring from index 3:"+ v1.substring(3)); //eJavaBasics
		System.out.println(v1.substring(5, 8));//ava
        System.out.println(v1.substring(4, 8));
        
        String k1="Java";
        String k2="Basic";
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k1+k2);           //JavaBasic
        System.out.println(k1.concat(k2));   //JavaBasic 
        String x1=k1+k2;
        System.out.println(x1);     //JavaBasic 
        String x2=k1.concat(k2);
        System.out.println(x2);       //JavaBasic 
        String vk="Komal Vitthal Ghodke";
        System.out.println("Length of vk:"+vk.length());
        System.out.println("Index of Vitthal:"+vk.indexOf("Vitthal"));
        System.out.println(vk.indexOf("a",4));     //1 only index of o
        System.out.println(vk.indexOf("o",3));  //16--> index of o after index3 
        System.out.println(vk.lastIndexOf("k" ,20));//18--> index of k before index 20
	}

}
