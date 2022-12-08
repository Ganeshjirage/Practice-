package synchronization.multithreading;

public class AccountDetails implements Runnable {

	Account account = new Account();

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			makeWithdrawal(500);
		
			if (account.getBalance() <= 0) {
				System.out.println("Insufficient Fund");
			}
		}
	}

	private synchronized void makeWithdrawal(int amt) {
		if (account.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is goint to withdraw " + amt);
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		int bal = account.withdraw(amt);
		System.out.println(Thread.currentThread().getName() + " Completed withdrawal, Account balance is " + bal);

	}

}
