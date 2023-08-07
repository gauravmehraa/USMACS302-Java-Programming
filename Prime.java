import java.lang.Math;

class Prime{
    public static void main(String args[]){
        if(args.length != 1){
            System.out.println("Incorrect arguments");
            System.exit(0);
        }
        int n = Integer.parseInt(args[0]);
        boolean isPrime = true;

        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime) System.out.println("Prime number");
        else System.out.println("Not a prime number");
    }
}