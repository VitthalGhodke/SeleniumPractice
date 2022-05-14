package keywords;

public class Thiskeyword4 {
   int a;
  int b;
   Thiskeyword4(int a, int b){
	   this.a=a;
	   this.b=b;
	   System.out.println("a= "+ a +" b=  "+b); 
   }
  void display() {
	  System.out.println("a= "+ a +" b=  "+b);
	  
  }
   
	public static void main(String[] args) {
	Thiskeyword4 n1=new Thiskeyword4(10,12);
	n1.display();
	Thiskeyword4 n2=new Thiskeyword4(101,120);
	n2.display();
           System.out.println("end");
	}

}
