package Reviews.java.eight.practice.by.ashok.example5;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SortListInReverseOrderWithLambda {

	static Logger logger;
	static MyList myList = list -> {
		list.sort(Comparator.reverseOrder());
		return list;
	};

	static {
		logger = Logger.getLogger(SortListInReverseOrderWithLambda.class.getName());
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(78, 78, 78, 78, 58, 45, 45, 58, 45, 12, 36, 14);
		logger.log(Level.INFO, "revers order of the List is: {0}", myList.reverseList(list));
	}

}