public class TwoExceptions{
	public static void main(String args[]){
		try{
			int a = 5;
			int b = Integer.parseInt(args[0]);
			int c = a/b;
			System.out.println(c);
		}
		catch(NumberFormatException e){
			System.out.println("Invalid datatype");
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");
		}
	}
}