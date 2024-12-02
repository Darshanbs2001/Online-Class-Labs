package Threads;
//Class to calculate average of the given first 10 numbers
class Average implements Runnable{

	@Override
	public void run() {
		int sum=0;
		//generate the first ten numbers
		for (int i=1;i<=10;i++) {
			sum=sum+i;
		}
		//print the average of the generated sum
		System.out.println("The average is "+(sum/10.0));
	}
	
}
//class to calculate the square of the given array
class Square implements Runnable{

	@Override
	public void run() {
		int arr[]= {1,20,50,15,30};
		//print the square for all the elements
	   for(int i=0;i<arr.length;i++) {
		   System.out.println("Square of "+arr[i]+" is "+arr[i]*arr[i]);
	   }
		 
	}
	
}
//main class
public class Assignment1 {
	
	public static void main(String[] args) throws InterruptedException {
	    //create the object of average
		Average a=new Average();
		//create the object of square
	    Square s =new Square();
	    //create the two threads to run both the tasks
		Thread t1=new Thread(a);
		Thread t2=new Thread(s);
		//use join method to make the two threads to execute one after
		//another
		t1.start();
		t1.join();
		t2.start();
		t2.join();
	}
}
