package loops;

public class Example1_ForLoop {

	public static void main(String[] args) {
		Example1_ForLoop obj = new Example1_ForLoop();
		obj.loop(10);

	}
	public void loop(int num) {
		for(int i=num; i>=0; i--) {
			System.out.println(i);
		}
	}

}
