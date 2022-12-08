package synchronization.multithreading;

public class MainTest {
	public static void main(String[] args) {
		AccountDetails ad = new AccountDetails();
		Thread t = new Thread(ad);
		Thread t1 = new Thread(ad);
		t.setName("Ganesh");
		t1.setName("Mahesh");
		t.start();
		t1.start();
	}

}
