public class Palindrome {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int copy = n, rev = 0;

        while(copy != 0){
            rev = (rev * 10) + (copy % 10);
            copy /= 10;
        }

        if(rev == n) System.out.println("Palindrome number");
        else System.out.println("Not a palindrome number");
    }
}
