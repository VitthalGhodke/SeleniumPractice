package casting;

public class Primitivecasting4 {

	public static void main(String[] args) {
		double D=23.23232356265d;
		float F=(float)D;
		long L=(long)D;
		int I=(int)D;
		short S=(short)D;
		byte B=(byte)D;
		
		System.out.println("Ex of narrowing");
		System.out.println(D);
		System.out.println(F);
		System.out.println(L);
		System.out.println(I);
		System.out.println(S);
		System.out.println(B);

	}

}
