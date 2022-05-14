package variables;

public class Nsgv1 {

	//global variable
		double empID=123; //non-static global variable.
		
		

		public static void main(String[] args) {
			System.out.println("Prigram Starts...");
			//create an instance/object
			Nsgv v1;    //no object created here
			v1=new Nsgv(); //object created here
			
			
			System.out.println("Non-static Global vriable empID:"+ v1.empID);
			
			v1.empID=333; //updating non-static global variable.
			System.out.println("Updated Non-static Global vriable empID:"+ v1.empID);
			System.out.println("Program ends");
		

	}

}
