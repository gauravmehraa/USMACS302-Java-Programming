public class Armstrong {
    public static void main(String args[]){
        if(args.length != 1){
            System.out.println("Incorrect arguments");
            System.exit(0);
        }
        int n = Integer.parseInt(args[0]);
        int copy = n, temp = 0, digit;

        while(copy != 0){
            digit = copy % 10;
            temp += (digit * digit * digit);
            copy /= 10;
        }

        if(temp == n) System.out.println("Armstrong number");
        else System.out.println("Not an armstrong number");
        
    }
}

