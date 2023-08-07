class Threads extends Thread {
	Notify monitor =  new Notify();
	Threads(String name){
		super(name);
	}

	public void run(){
		int i = 1;
		while(i <= 10){
			synchronized(monitor){
				System.out.println(this.getName()+" : "+i);
				if(i == 6){
					try{
						monitor.wait();
					}
					catch(InterruptedException e){
						System.out.println("Error");
					}

				}
				i++;
				monitor.notifyAll();
			}

		}
		System.out.println("Thread "+this.getName()+" stopped.");
	}
}

public class Notify{
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
