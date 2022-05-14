package variables;

public class Globalvariable4 {
	//global variable
	static int empID=123;             //static global variable 
	
	

	public static void main(String[] args) {
		int age=30;                  //local variable
		System.out.println("Local Variable, age:"+age);
		age=45;
		System.out.println("Updated age:"+age);
		System.out.println("Direct way to access SGV:"+empID);
		System.out.println("Standard way to access SGV:"+Globalvariable4.empID);//123
	    empID=555;
		System.out.println("Direct way to access SGV:"+empID); //555
		System.out.println("Standard way to access SGV:"+Globalvariable4.empID);//555
		
		 int empID=222;
			System.out.println("Direct way to access SGV:"+empID); //222
			System.out.println("Standard way to access SGV:"+Globalvariable4.empID);//555
			
		

	}

}
