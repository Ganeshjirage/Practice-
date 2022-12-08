package without.wait.notify.sync.multi.thread;

public class MyThread extends Thread {
	int sum = 0;

	public void run() {
		synchronized (this) {
			for (int i = 1; i < 5; i++) {
				sum = sum + 10;
			}
		}
		this.notify();
	}

	public static void main(String[] args)  {
		MyThread mt = new MyThread();
		mt.start();
		//System.out.println(mt.sum);
		synchronized (mt) {
			try {
				mt.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(mt.sum);
		}
	}
}
