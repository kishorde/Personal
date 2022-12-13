public class EvenOdd {

	class Numbers implements Runnable {
		public void run() {

		}
	}

	public static void main(String[] args) throws InterruptedException {

		Runnable runnable = () -> {
			for (int i = 0; i <= 20; i++) {
				if (i % 2 == 0) {
					System.out.println("Even numbers : " + i);
				}
			}
		};

		Runnable runnable1 = () -> {
			for (int i = 0; i <= 20; i++) {
				if (i % 2 != 0) {
					System.out.println("odd numbers : " + i);
				}
			}
		};

		Thread thread = new Thread(runnable, "Even");
		thread.start();
		thread.join();
		Thread thread1 = new Thread(runnable1, "Odd");
		thread1.start();
	}
}
