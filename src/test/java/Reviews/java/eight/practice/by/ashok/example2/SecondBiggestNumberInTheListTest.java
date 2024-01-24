package Reviews.java.eight.practice.by.ashok.example2;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SecondBiggestNumberInTheListTest {

	static Logger logger;

	static {
		logger = Logger.getLogger(SecondBiggestNumberInTheListTest.class.getName());
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(78, 78, 78, 78, 58, 45, 45, 58, 45, 12, 36, 14);
		list = new ArrayList<>(new HashSet<>(list));
		Collections.sort(list);
		logger.log(Level.INFO, "Second largest number in List is: {0}", list.get(list.size() - 2));
	}
}