public class LCM{
    public static void main(String args[]){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        System.out.println("LCM: "+ lcm(x, lcm(y, z)));
        
    }
    public static int hcf(int a, int b) {
		if (b == 0) return a;
		return hcf(b, a % b);
	}
    public static int lcm(int a, int b){
        return (a*b) / hcf(a, b);
    }
}

