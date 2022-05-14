package casting;


public class Primitivecasting {

	public static void main(String[] args) {
		int age = 9;//
		double myage = age;//widing implicit(Auto), when java compiler writes behalf of you--> double d=(double)age;
		double d=(double)age;//widing explicit
		System.out.println(age); //
		System.out.println(myage); //
		System.out.println(d);//

		double salary=23400.67856856898989545d;		
		int sal=(int)salary;//narrowing,explicit
		long f=(long)salary;//narrowing,explicit
		float f1=(float)salary;//narrowing,explicit
		System.out.println("Actual Salary: "+salary);
		System.out.println("Int Salary: "+sal);
		System.out.println("long Salary: "+f);
		System.out.println("float Salary: "+f1);

	}

}
/*Casting:Converting data one type to another 
 *       type Casting is the process of converting one type of data into another type.
 *        type casting devided into two typs 
 *        1.Primitive casting
 *        2.derived/Non-primitive Casting
 *   1.Primitive data type is converted into one type to anather known as Primitive casring.
 *   it is further devided into two typs
 *                  A.widing Type Casting.(Implicitly or explicitly)Automatic
 *                  B.Narrowing Type casting.( Only Explicit)Manualy by programer.
 *                
 *    A.Widing:convert the value from lower data type to higher data type called Widing type Casting,
 *      it is also known as implicit conversion.it is done  Automatically and Manually
 *      (Auto-Widing)
 *     
 *    B.Narrowing:Converting the Higher Data type to Lower data type called as Narrowing.
 *      it is also known as explicit conversion.
 *      it is done manualy by programer.
 *                    
 */
