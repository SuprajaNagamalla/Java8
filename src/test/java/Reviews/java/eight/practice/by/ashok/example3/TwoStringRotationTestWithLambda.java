package Reviews.java.eight.practice.by.ashok.example3;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TwoStringRotationTestWithLambda {

	static Logger logger;
	static ValidateString validateString = (str1, str2) -> str1.length() == str2.length() && (str1 + str1).contains(
			str2);

	static {
		logger = Logger.getLogger(TwoStringRotationTestWithLambda.class.getName());
	}

	public static void main(String[] args) {
		String str1 = "12345";
		String str2 = "45123";

		if (validateString.isRotation(str1, str2) && validateString.isRotation(str2, str1)) {
			logger.log(Level.INFO, "Strings are rotations of each other");
		} else {
			logger.log(Level.INFO, "Strings are not rotations of each other");
		}

	}
}