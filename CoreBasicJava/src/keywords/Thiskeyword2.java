package keywords;

public class Thiskeyword2 {
int variable=25;  //GV or non static GV or Instance GV 
 void method(int variable) {
	 System.out.println("Value of local variable"+variable); //20
          variable=10;
          System.out.println("value of local variable"+variable);//10
          System.out.println("value of intance variable"+this.variable);//25
          this.variable=variable;
          System.out.println("value of GV"+variable);//10
          System.out.println("value of GV"+this.variable);//10
          }
 void method1(int v, float k ) {
	 System.out.println(v+"  "+k);
	 System.out.println(variable);
	 System.out.println(this.variable);
 }
	public static void main(String[] args) {
		Thiskeyword2 c1=new Thiskeyword2();
		c1.method(20);
        c1.method1(35, 22.23f);
	}

}
