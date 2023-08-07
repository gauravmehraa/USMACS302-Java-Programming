public class Threads extends Thread {
	private int n = 1;

	Threads(String name){

	}

	public void run(String number){
		System.out.println(name+" : "+number);
		number++;
	}
	public static void main(String args[]){

		Threads t1 = new Threads("FirstThread");
		t1.start();

	}
}