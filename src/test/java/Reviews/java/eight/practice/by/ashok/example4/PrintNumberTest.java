package Reviews.java.eight.practice.by.ashok.example4;

import Reviews.java.eight.practice.by.ashok.example1.PalindromeTest;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;


public class PrintNumberTest {
	static Logger logger;

	static {
		logger = Logger.getLogger(PalindromeTest.class.getName());
	}

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				IntStream.rangeClosed(1, 10).forEach(i -> {
					logger.log(Level.INFO, "Number from Runnable: {0}", i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						logger.log(Level.SEVERE, e.toString());
						Thread.currentThread().interrupt();
					}
				});
			}
		}).start();

		for (int i = 1; i <= 10; i++) {
			logger.log(Level.INFO, "Number from Main: {0}", i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				logger.log(Level.SEVERE, e.toString());
				Thread.currentThread().interrupt();
			}
		}
	}
}

