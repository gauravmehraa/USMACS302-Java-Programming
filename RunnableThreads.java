public class RunnableThreads implements Runnable{
	public void run(){
		int i;
		for(i = 1; i <= 9; i+=2){
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	}

	public static void main(String args[]){
		RunnableThreads temp1 = new RunnableThreads();
		Thread t1 = new Thread(temp1, "T1");
		RunnableThreads temp2 = new RunnableThreads();
		Thread t2 = new Thread(temp2, "T2");

		t1.start();
		t2.start();
		
	}
}