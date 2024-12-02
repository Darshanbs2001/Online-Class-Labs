package Thread2;

//create a base thread 
public class Assignment1 extends Thread {
	// initialize the name of the thread using the super method
	public Assignment1(String name) {
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// print which thread is executing
		System.out.println(super.getName() + " is executing ");
		try {
			// based on priority sleep for certain amount time
			this.sleep(super.getPriority());
			// after the sleep time is elapsed the thread
			// gains the control and executes print completed
			System.out.println(super.getName() + " is completed the execution");
		} // handle the exception that could raise because of
			// sleep method
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// create the thread threads with different names
		Assignment1 t1 = new Assignment1("Thread-1");
		Assignment1 t2 = new Assignment1("Thread-2");
		Assignment1 t3 = new Assignment1("Thread-3");
		t1.setPriority(MIN_PRIORITY);// set the low priority
		t2.setPriority(NORM_PRIORITY);// set the middle priority
		t3.setPriority(MAX_PRIORITY);// set the highest priority
		// run the threads
		t1.start();
		t2.start();
		t3.start();

	}
}
