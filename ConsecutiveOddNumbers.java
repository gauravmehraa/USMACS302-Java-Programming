public class Threads implements Runnable{
	int start;
	Threads(int start){
		this.start = start;
	}

	@Override
	public void run(){
		while(true){
			synchronized(this){
				System.out.println()
			}
		}
	}
}