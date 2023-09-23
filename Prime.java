public class Prime{
    public static void main(String args[]){
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