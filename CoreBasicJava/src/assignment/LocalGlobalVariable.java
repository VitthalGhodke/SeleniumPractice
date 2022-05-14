package assignment;

public class LocalGlobalVariable {
	//global Variable====> static & non-static
	static int empID,age=35;                       // static global Variable
	double salary=25000;                         //non-static global Variable
	//method
	public static void callA() {                     //static method
		System.out.println("I am callA()");
		
	}
	 void callB() {                              //non-static method
		System.out.println("I am callB()");
		
	}	
	static int callC(int acc) {                            
			System.out.println("I am callC()");
			return acc;
		}	
	public double callD(int pin) {                            
		System.out.println("I am callD()");
		return pin;
		}	
	public static void main(String[] args) {
		//non-static member:salary,callB
		 LocalGlobalVariable ref=new LocalGlobalVariable(); //creat an object
		 System.out.println("non-static global variable"+ref.salary);//25000
		 ref.salary=58000;
		 System.out.println("non-static global variable"+ref.salary);//58000
		 ref.callB();   //cal to non-static method
            //way-1
		 ref.callD(414203);//it will be execute but you will dont get its return value on console
		 //way-2
		 System.out.println(ref.callD(414203));//it will be execute and return value you can see on console
		 //way-3
		 double rvalue=ref.callD(414203);
		 System.out.println(rvalue);
		 
		 
		 
		 
		
		//local variable
		int age;                             // local variable declared
		age=25;                              // local variable initialize
		System.out.println("age:"+age);
		//static member:empID,age,callA(),callC
		System.out.println("Global variable empID:"+LocalGlobalVariable.empID);
	    System.out.println("Global variable age:"+LocalGlobalVariable.age);	
	    
	    System.out.println("Global variable empID:"+empID); //directly accessing of static global variable
	    System.out.println("Global variable age:"+age);	//JVM will search first in its own body.  =25;
	    //call to static method same as a static variable
	    LocalGlobalVariable.callA();//it return type as void so no need to write in println
	    
	    //way-1
	    LocalGlobalVariable.callC(1001);//it will be execute but you will not able to use/see its return value
	    //way-2
	    System.out.println(LocalGlobalVariable.callC(1001));//it will be execute& also you will get method return value
	    //way-3
	    int value= LocalGlobalVariable.callC(1001);
	    System.out.println(value);
	    
	    
	}
	

}

/**
*local/global variable declaration:datatype variablename;
*local/global initialize the variable: variablename=value;
*     //or  
* declare & initialize the variable: datatype variablename=value;
*  member: method & variable.
* static member: static method & static Variable==>to access use classname or access directly from another static method 
* non-static member: non-static method & non-static Variable==>to access use instance or creat an object of required class 
*                                classname ref; //no object created
*                                new classname();//object created
*                                classname ref;
*                                ref =new classname();
*                                      //or
*                               classname ref =new classname(); 
*                                
*                             
*/