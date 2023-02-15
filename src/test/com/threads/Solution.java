package test.com.threads;
public class Solution implements Runnable {
	public void run() {
		System.out.printf("Java ");
		System.out.printf("World ");
	}

	public static void main(String[] args) {
		Solution obj = new Solution();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.printf("SDE ");
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("for ");
	}
}
