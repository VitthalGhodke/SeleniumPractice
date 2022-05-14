package modifier;

public class Defaultmembers {
	  int salary=45000;
	  void display1() {
		 System.out.println("Age:"+salary);
		
	 }

	public static void main(String[] args) {
   Defaultmembers M= new Defaultmembers();
   M.display1();
   System.out.println(M.salary);
   }

}
class accessdefaultmembers{                      //Default modifiers access outside the class
	public static void main(String[] args) {
		   Defaultmembers M= new Defaultmembers();
		   M.display1();
		   System.out.println(M.salary);
		   }
}