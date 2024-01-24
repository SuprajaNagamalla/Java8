package Reviews.java.eight.practice.by.ashok.example9;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DescendingTreeMapTest {

	static Logger logger;

	static {
		logger = Logger.getLogger(DescendingTreeMapTest.class.getName());
	}

	public static void main(String[] args) {
		TreeMap<Integer, String> descendingTreeMap = new TreeMap<>(Collections.reverseOrder());

		descendingTreeMap.put(1, "One");
		descendingTreeMap.put(3, "Three");
		descendingTreeMap.put(2, "Two");
		descendingTreeMap.put(5, "Five");
		descendingTreeMap.put(4, "Four");

		logger.log(
				Level.INFO, "order of the tree map is: {0}\n", descendingTreeMap.entrySet());

	}
}

