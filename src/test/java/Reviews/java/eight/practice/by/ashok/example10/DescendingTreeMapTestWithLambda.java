package Reviews.java.eight.practice.by.ashok.example10;

import Reviews.java.eight.practice.by.ashok.example8.SortEmployeeAlphabeticallyTest;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

//import java.eight.practice.by.ashok.example8.SortEmployeeAlphabeticallyTest;


public class DescendingTreeMapTestWithLambda {

	static Logger logger;

	static {
		logger = Logger.getLogger(SortEmployeeAlphabeticallyTest.class.getName());
	}

	public static void main(String[] args) {
		Comparator<Employee> nameComparator = (e1, e2) -> e2.getName().compareTo(e1.getName());

		TreeMap<Employee, Integer> descendingTreeMap = new TreeMap<>(nameComparator);

		descendingTreeMap.put(new Employee(1, "John"), 1001);
		descendingTreeMap.put(new Employee(2, "Alice"), 1002);
		descendingTreeMap.put(new Employee(3, "Bob"), 1003);
		descendingTreeMap.put(new Employee(4, "Zoe"), 1004);
		descendingTreeMap.put(new Employee(5, "Charlie"), 1005);

		for (Map.Entry<Employee, Integer> entry : descendingTreeMap.entrySet()) {
			logger.log(Level.INFO,entry.getKey() + " => " + entry.getValue());
		}
	}
}

