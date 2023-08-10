public class Calculator{

	double n1, n2;
	double n;
	
	Calculator(int a){
		this.n = a;
	}
	Calculator(double a, double b){
		this.n1 = a;
		this.n2 = b;
	}
	double inverse(){
		return 1/n;
	}
	double negation(){
		return -1*n;
	}
	double root(){
		return Math.sqrt(n);
	}
	double add(){
		return n1+n2;
	}
	double multiply(){
		return n1*n2;
	}
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		Calculator calc1 = new Calculator(a);
		Calculator calc2 = new Calculator(a, b);

		System.out.println(calc1.inverse());
		System.out.println(calc1.negation());
		System.out.println(calc1.root());

		System.out.println(calc2.add());
		System.out.println(calc2.multiply());
	}
}