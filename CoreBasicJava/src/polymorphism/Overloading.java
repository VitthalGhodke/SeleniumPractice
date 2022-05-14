package polymorphism;

class Vitthal{
	public static void komal() {
		System.out.println("Komal");
	}
	 void komal(int age) {
		System.out.println("Age of komal is :"+age);
	}
}

public class Overloading {
	 void Area() {
		System.out.println("Find Area");
	}
	static void Area(int r) {
		System.out.println("Area of Circul="+ 3.14*r*r);
	}
	static void Area(double b,double h) {
		System.out.println("Area of Tringle ="+0.5*b*h);
	}
	static void Area(int a,int b) {
		System.out.println("Area of Rectangle="+a*b);
	}

	public static void main(String[] args) {
		Vitthal.komal();	
		Vitthal m1=new Vitthal();
	    m1.komal(20);
		Overloading m=new Overloading();
		m.Area();
		Area(5);
		Area(10,12);
		Area(23,22);
		
		
		
	}

}
