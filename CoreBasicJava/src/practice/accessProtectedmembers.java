package practice;

import modifier.Protectedmembers;

public class accessProtectedmembers extends Protectedmembers {

	public static void main(String[] args) {
		accessProtectedmembers p=new accessProtectedmembers();
		System.out.println("Accessing Protected members from child class");
		p.display2();
        System.out.println(p.salary);

	}

}
