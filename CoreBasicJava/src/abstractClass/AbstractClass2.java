package abstractClass;
               //Abstract class
abstract class Shape { 
	abstract void draw();  //Abstract method 
}

          // In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape {
	protected void draw() {
		System.out.println("drawing rectangle");
	}
}
class Circle extends Shape {
	public void draw() {
		System.out.println("drawing circle");
	}
}

public class AbstractClass2 {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.draw();
		Circle c=new Circle();
		c.draw();
		Shape s1=new Rectangle();
		s1.draw();
		Shape s2=new Circle();
		s2.draw();
		

	}

}
