public class Factorial {
    public static void main(String args[]){
        if(args.length != 1){
            System.out.println("Incorrect arguments");
            System.exit(0);
        }
        int n = Integer.parseInt(args[0]);

        System.out.println("Factorial: "+ factorial(n));
        
    }

    static long factorial(int n){
        return n==0?1:n*factorial(n-1);
    }
}

