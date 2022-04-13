package RegularExpression;

public class multithreading1 {
public static void main(String[] args) {
	Task t = new Task();
	Thread t1 = new Thread(t);
	Thread t2 = new Thread(t);
	t2.setName("k");
	t1.start();
	t2.start();
	someFunctionaCalled();
	try {
		t1.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("In main method");
	
}

private static void someFunctionaCalled() {
	// TODO Auto-generated method stub
	System.out.println("Function called");
	
}
}
class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside run method in task class"+Thread.currentThread().getName());
		
	}
	

}
