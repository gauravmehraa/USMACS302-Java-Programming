public class Factorial {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        System.out.println("Factorial: "+ factorial(n));   
    }
    static long factorial(int n){
        return n==0?1:n*factorial(n-1);
    }
}

