package interfacekeyword;
interface printable2{
	void print();
}
interface Drawable2 extends printable2{
	void draw();
}

public class Interface5 implements Drawable2{
	public void print() {
		System.out.println("Heloo print");
	}
	public void draw() {
		System.out.println("Hello draw");
	}

	public static void main(String[] args) {
		Interface5 k=new Interface5();
		k.print();
		k.draw();
		System.out.println("**********Vitthal***********");
		printable2 k1=new Interface5();
		k1.print();
		Drawable2 k2=new Interface5();
		k2.draw();
		

	}

}
