package Reviews.java.eight.practice.by.ashok.example1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PalindromeTestWithLambda {

	static Logger logger;
	static ValidateString validateString = str -> {
		String reversed = new StringBuilder(str).reverse().toString();
		return str.equals(reversed);
	};

	static {
		logger = Logger.getLogger(PalindromeTestWithLambda.class.getName());
	}

	public static void main(String[] args) throws Exception {
		String name = new BufferedReader(new InputStreamReader(System.in)).readLine();
		name = validateString.isPalindrome(name) ? name + " - is palindrome" : name + " - is not palindrome";
		logger.log(Level.INFO, name);
	}
}