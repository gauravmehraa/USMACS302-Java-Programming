public class HCF{
    public static void main(String args[]){
        if(args.length != 3){
            System.out.println("Incorrect arguments");
            System.exit(0);
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        System.out.println("HCF: "+ hcf(x, y, z));
        
    }
    public static int hcf(int a, int b) {
		if (b == 0)
			return a;
		else
			return hcf(b, a % b);
	}
    public static int hcf(int a, int b, int c) {
		return hcf(hcf(a, b), c);
	}
}

