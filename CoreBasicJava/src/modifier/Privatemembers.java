package modifier;

public class Privatemembers {
	 private int age=40;
	 private void display() {
		 System.out.println("Age:"+age);
		
	 }

	public static void main(String[] args) {
   Privatemembers M= new Privatemembers();
   M.display();
   System.out.println(M.age);
   

	}

}
class AccessPrivateMembers2 {

	public static void main(String[] args) {
     // Privatemembers M= new Privatemembers();  //dont access out side the class
	// M.display();
    //System.out.println(M.age);
		
	}
}