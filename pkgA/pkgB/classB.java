package pkgA.pkgB;

import pkgA.*;

public class classB extends classA implements intfB{
	public int hcf(int a, int b, int c){
		return hcf(hcf(a, b), c);
	}
}