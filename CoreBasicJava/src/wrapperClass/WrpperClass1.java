package wrapperClass;




public class WrpperClass1 {

	public static void main(String[] args) {
		int age=22;    //Normal Declaration
		System.out.println(age);
	/*wrapper class 
	 *    -->is the mechanism used to convert the primitive type into object and object into primivitive type,
	 *    - it is the predefined class in java which is belongs to java.lang.package
	 *   Boxing-When we convert the primitive type inro object known as boxing,(implicitly and explicitly)
	 *    Integer i=40; //Autoboxing /implicitly boxing
	 *    Integer i=new Integer(40); //explicitly boxing
	 *  Unboxing-When we convert object into primirive type known as unboxing(only explicitly)
	 *    #Only boxed object can be unboxed, mens we need boxing firstly and then unboxing
	 *     Double d=96000; //Boxing
	 *     double d1=d.doublevalue(); //unboxing  
	 *     
	 *         in wrapper class toString() & equlas & '==' are overrided
	 *         	
	 */
      Integer i=55;                 //implicitly boxing
      Integer i1=new Integer(20);    //implicitly boxing
      System.out.println(i);
      System.out.println(i1);
      char c1='z';        //implicitly boxing
      Character c2=new Character('A'); //implicitly boxing
      System.out.println(c1);
      System.out.println(c2);
      System.out.println(c1==c2);
      System.out.println(i.equals(i1));
	}

}
