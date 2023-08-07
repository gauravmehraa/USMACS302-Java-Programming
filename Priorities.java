class Threads extends Thread {
	Threads(String name, int priority){
		super(name);
		this.setPriority(priority);
	}

	public void run(){
		System.out.println("Thread "+this.getName()+" (Priority: "+this.getPriority()+") started.");
		for(int i = 1; i <= 5; i++){
			System.out.println(this.getName()+" : "+i);
		}
		System.out.println("Thread "+this.getName()+" (Priority: "+this.getPriority()+") stopped.");
	}
}

public class Priorities{
	public static void main(String args[]){

		Threads t1 = new Threads("T1", Thread.MAX_PRIORITY);
		Threads t2 = new Threads("T2", Thread.NORM_PRIORITY);
		Threads t3 = new Threads("T3", Thread.NORM_PRIORITY);
		Threads t4 = new Threads("T4", Thread.MIN_PRIORITY);

		t1.start();	
		t2.start();
		t3.start();
		t4.start();

	}
}
