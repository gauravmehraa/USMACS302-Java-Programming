package pkgA;

public class classA implements intfA{
	public int hcf(int a, int b){
		if (b == 0)
			return a;
		else
			return hcf(b, a % b);
	}
}