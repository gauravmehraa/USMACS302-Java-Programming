public class Fibonacci{
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        
        for(int i = 0; i < n; i++) System.out.print(fib(i)+" ");
        
    }
    public static int fib(int num){
        return num>=2?fib(num-1) + fib(num-2):num;
    }
}

