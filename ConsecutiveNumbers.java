class Threads extends Thread {

	Threads(String name){
		super(name);
	}

	public void run(){
		System.out.println("Thread "+this.getName()+" started.");
		for(int i = 1; i <= 5; i++){
			System.out.println(this.getName()+" : "+i);
		}
		System.out.println("Thread "+this.getName()+" stopped.");
	}
}

public class ConsecutiveNumbers{
	public static void main(String args[]){

		Threads t1 = new Threads("T1");
		Threads t2 = new Threads("T2");
		Threads t3 = new Threads("T3");
		Threads t4 = new Threads("T4");

		t1.start();	
		t2.start();
		t3.start();
		t4.start();

	}
}
