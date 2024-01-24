package Reviews.java.eight.practice.by.ashok.example3;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TwoStringRotationTest {

	static Logger logger;

	static {
		logger = Logger.getLogger("TwoStringRotationTest");
	}

	static boolean checkForRotation(String str1, String str2) {
		return (str1.length() == str2.length()) && ((str1 + str1).contains(str2));
	}

	public static void main(String[] args) {
		String str1 = "12345";
		String str2 = "45123";
		if (checkForRotation(str1, str2) && checkForRotation(str2, str1)) {
			logger.log(Level.INFO, "Strings are rotations of each other");
		} else {
			logger.log(Level.INFO, "Strings are not rotations of each other");
		}
	}
}