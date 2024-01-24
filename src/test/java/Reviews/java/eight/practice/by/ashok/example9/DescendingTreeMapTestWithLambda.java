package Reviews.java.eight.practice.by.ashok.example9;

import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DescendingTreeMapTestWithLambda {

	static Logger logger;

	static {
		logger = Logger.getLogger(DescendingTreeMapTestWithLambda.class.getName());
	}

	public static void main(String[] args) {
		TreeMap<Integer, String> descendingTreeMap = new TreeMap<>((value1, value2) -> value2.compareTo(value1));

		descendingTreeMap.put(1, "One");
		descendingTreeMap.put(3, "Three");
		descendingTreeMap.put(2, "Two");
		descendingTreeMap.put(5, "Five");
		descendingTreeMap.put(4, "Four");

		logger.log(Level.INFO, "order of the tree map is: {0}\n", descendingTreeMap.entrySet());

	}
}

