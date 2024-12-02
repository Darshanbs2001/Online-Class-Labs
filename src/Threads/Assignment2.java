package Threads;

//create a Runner thread
class Runner implements Runnable {
	int size;

	// initialize the number of iterations
	public Runner(int n) {
		this.size = n;
	}

	// method for making the runner to run
	public void startRunning(String name) {

		for (int i = 0; i < size; i++) {
			System.out.println(name + "is running in " + i + " th iteration");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		startRunning(name);
	}

}

//main class
public class Assignment2 {
	public static void main(String[] args) {
		// create the object of runner
		Runner r = new Runner(5);
		// creating the threads to run as Thread-1,Thread-2,Thread-3
		Thread r1 = new Thread(r, "Thread-1");
		Thread r2 = new Thread(r, "Thread-2");
		Thread r3 = new Thread(r, "Thread-3");
		// setting the thread priorities
		r1.setPriority(2);
		r2.setPriority(8);
		r3.setPriority(6);
		// start the threads
		r1.start();
		r2.start();
		r3.start();

	}
}
