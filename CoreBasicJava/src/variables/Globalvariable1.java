package variables;

public class Globalvariable1 {
	 //global variables 
	 int empID=1233;               //   non-static global variable or instant variable.
	 static double salary=45000;   // static global variable or class variable.

	public static void main(String[] args) {
		int age=30; //local variable
		System.out.println(age);
		System.out.println(salary);// Direct way to access static global variable
		System.out.println(Globalvariable1.salary);//Standard way to access static global variable
		int empID=2312;//local variable
		Globalvariable1 g1=new 	Globalvariable1(); //Object creation for to access the NSGV
		System.out.println(g1.empID);
		System.out.println(empID);
		
			}

}
//Global Variable==>a variable declared outside the method body and inside the class body known as global variable 
 /* types;
  *     A.static global variable or class variable. ----  it contain static keyword
  *       1.declare with static keyword.
  *       2.class variable or class member.
  *       3.loaded at compile time because they are class member.
  *       4.for static member memory location happens only one.(single memory location)
  *       5.can be access using classname or directly inside another static method.--classname.staticvariablename 
  *     B.non-static global variable or instant variable. ----  doesn't contain static keyword 
  *     
  */
/* Non-static global variable or instance variable
 *   1.Declared without static
 *   2.Known as instance/object variable or instance/object member
 *   3.loaded in the memory at run time because they are instance/object member which are created at run time
 *   4.create an instance/object:
 *         Syntax for create an instance;
 *                  classname referancevariable;        //no object create
 *                  referancevariable=new classname();  //object create her
 *                             or
 *                  classname referancevariable=new classname();
 *     5. to access them you need to use
 *                  referancevariable.non-staticvariablename;
 *             //or you can access nonsatic variable directly from another nonsatic method
 *     6.for non static member memory location happens multiple time based on object creation                                   
 */