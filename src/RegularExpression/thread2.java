package RegularExpression;

public class thread2 {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName()+"main thread  started");
	Thread t1 = new Thread(new campaign());
	Thread t2 = new Thread(new pollResearch());
	t1.setName("campaign");
	t2.setName("pollResearch");
	t1.setPriority(Thread.MAX_PRIORITY);
	t2.setPriority(Thread.MIN_PRIORITY);

	t1.start();
	t2.start();
	try {
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(Thread.currentThread().getName()+"main thread  ended");

}
}
class campaign implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName());
			if(i==5) {
				Thread.currentThread().yield();
			}
		}
		
	}
	
}
class pollResearch implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
}
