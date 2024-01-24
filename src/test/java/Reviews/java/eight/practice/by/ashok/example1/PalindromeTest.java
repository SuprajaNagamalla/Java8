package Reviews.java.eight.practice.by.ashok.example1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PalindromeTest {

	static Logger logger;

	static {
		logger = Logger.getLogger(PalindromeTest.class.getName());
	}

	public static void main(String[] args) throws Exception {
		String name = new BufferedReader(new InputStreamReader(System.in)).readLine();
		name = name.equals(String.valueOf(new StringBuilder().append(name).reverse())) ?
				name + " - is palindrome" :
				name + " - is not palindrome";
		logger.log(Level.INFO, name);
	}
}