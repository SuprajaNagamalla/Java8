package Reviews.java.eight.practice.by.ashok.example7;

import Reviews.java.eight.practice.by.ashok.example5.SortListInReverseOrderWithLambda;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

//import java.eight.practice.by.ashok.example5.SortListInReverseOrderWithLambda;


public class ReverseTreeSetTestWithLambda {

	static Logger logger;
	static MyTreeSet myTreeSet = myTreeSet1 -> {
		TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
		treeSet.addAll(myTreeSet1);
		return treeSet;
	};

	static {
		logger = Logger.getLogger(SortListInReverseOrderWithLambda.class.getName());
	}

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();

		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(9);
		treeSet.add(1);
		treeSet.add(7);

		logger.log(Level.INFO, "order before sort: {0}", treeSet);
		logger.log(Level.INFO, "order after sort: {0}", myTreeSet.reverseSort(treeSet));
	}
}

