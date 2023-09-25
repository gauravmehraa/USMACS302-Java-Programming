public class ThrowsException{
	public static void main(String args[]){
		try{
			float n = divide(5, 0);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
	static float divide(int num, int den) throws ArithmeticException{
		if(den == 0) throw new ArithmeticException("Divison by zero");
		return num/den;
	}
}