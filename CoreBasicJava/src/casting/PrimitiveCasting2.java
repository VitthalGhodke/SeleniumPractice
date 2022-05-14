package casting;

public class PrimitiveCasting2 {

	public static void main(String[] args) {
		double d=12.3d;
		int i=(int)d;//narrowing
		byte b=(byte)i;//narrowing
		double d1=(double)i;//explicit widing
		double d3=i;// implicit widing
		System.out.println(d);
		System.out.println(i);
        System.out.println(b);
        System.out.println(d1);
        System.out.println(d3);
	}

}
