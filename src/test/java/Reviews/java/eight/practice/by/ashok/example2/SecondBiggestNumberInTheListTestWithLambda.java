package Reviews.java.eight.practice.by.ashok.example2;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SecondBiggestNumberInTheListTestWithLambda {

	static Logger logger;

	static {
		logger = Logger.getLogger(SecondBiggestNumberInTheListTestWithLambda.class.getName());
	}

	static MyList myList = myList1 -> {
		myList1 = new ArrayList<>(new HashSet<>(myList1));
		Collections.sort(myList1);
		return myList1.get(myList1.size() - 2);
	};

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(78, 78, 78, 78, 58, 45, 45, 58, 45, 12, 36, 14);
		logger.log(Level.INFO, "Second largest number in List is: {0}", myList.getSecondBiggest(list));
	}
}