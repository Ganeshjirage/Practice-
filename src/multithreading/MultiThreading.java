package multithreading;

public class MultiThreading extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		MultiThreading mt = new MultiThreading();
		mt.start();
		System.out.println(mt.MIN_PRIORITY);
		System.out.println(mt.MAX_PRIORITY);
		System.out.println(mt.NORM_PRIORITY);
		System.out.println(mt.getId());
		System.out.println(mt.getName());
		System.out.println(mt.getPriority());
		System.out.println(mt.getState());
		
	}

}
