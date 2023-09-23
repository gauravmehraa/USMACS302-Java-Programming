package pkgA.pkgB.pkgC;

import pkgA.*;
import pkgA.pkgB.*;

public class classMain{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		intfA objA = new classA();
		intfB objB = new classB();

		int hcf1 = objA.hcf(a, b);
		int hcf2 = objB.hcf(a, b, c);

		System.out.println(hcf1);
		System.out.println(hcf2);
	}
}