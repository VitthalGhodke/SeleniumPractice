package variables;

public class Nsgv {
	//global variable
	double empID=123; //non-static global variable.
	
	

	public static void main(String[] args) {
		System.out.println("Prigram Starts...");
		//create an instance/object
		Nsgv v1;    //no object created here
		v1=new Nsgv(); //object created here
		System.out.println("Non-static Global vriable empID:"+ v1.empID);
		System.out.println("Program ends");

	}

}
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
 * 
 *     
 */
