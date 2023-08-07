public class ZeroDivision{
	public static void main(String args[]){
		try{
			int n = 5/0;
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");
		}
	}
}