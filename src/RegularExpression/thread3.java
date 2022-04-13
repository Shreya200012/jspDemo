package RegularExpression;

public class thread3 {
public static void main(String[] args) {
	bankAccount ba = new bankAccount(500);
	Thread t = new Thread(ba);
	//ba.moneyWithdraw(200);
	t.setName("First");
	Thread t1 = new Thread(ba);
	t1.setName("Second");
	t1.start();
	t.start();
	
}
}
class bankAccount implements Runnable {
	private int balance;
	public bankAccount(int balance) {
		this.balance=balance;
	}
	public void moneyWithdraw(int amount){
		if(balance>=amount) {
			System.out.println(Thread.currentThread().getName()+" about to  withdraw= "+amount);

			balance -= amount;
			System.out.println(Thread.currentThread().getName()+" Balance remaining= "+this.balance);
		}
		else {
			System.out.println(Thread.currentThread().getName()+"Not enough balance, balance =  "+this.balance);
		}
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		moneyWithdraw(140);
		//moneyWithdraw(200);

		if(this.balance>0) {
			System.out.println(Thread.currentThread().getName()+ " money overdrawn");
		}
		
	}
}