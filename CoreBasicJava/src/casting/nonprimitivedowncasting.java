package casting;

 class parent{
	 double phone;
	 void chat() {
		 System.out.println("chatting withe"+phone);
	 }
 }
class child extends parent{
	void chat2() {
		System.out.println("chat 2");
	}
}
public class nonprimitivedowncasting {

	public static void main(String[] args) {
		parent p1=new child();
		p1.phone=45671;
		p1.chat();
		System.out.println("Down casting");
		child p2=(child)p1; //down casting
		p2.chat();
		p2.phone=46897;
		p2.chat2();
		
		

	}

}
/**
* child class object referred by any of its parent known as up casting

* parent class object referred by any of its child class known as downcasting
  directly downcasting is not possible in java

Child c2=new Parent();//downcasting but not possible in this way

Parent p1=new Child();

Child c1=(Child)p1;//downcasting, as Upcasting object is getting down casted here
 */