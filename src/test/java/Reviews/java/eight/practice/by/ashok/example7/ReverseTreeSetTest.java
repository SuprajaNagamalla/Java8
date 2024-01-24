package Reviews.java.eight.practice.by.ashok.example7;

import Reviews.java.eight.practice.by.ashok.example5.SortListInReverseOrderWithLambda;

//import java.eight.practice.by.ashok.example5.SortListInReverseOrderWithLambda;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReverseTreeSetTest {

	static Logger logger;

	static {
		logger = Logger.getLogger(SortListInReverseOrderWithLambda.class.getName());
	}

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());

		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(9);
		treeSet.add(1);
		treeSet.add(7);

		logger.log(Level.INFO, "order after sort: {0}", treeSet);
	}
}

