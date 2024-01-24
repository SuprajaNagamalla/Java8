package Reviews.java.eight.practice.by.ashok.example6;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;


public class SortEmployeeAlphabeticallyTestWithLambda {

	static Logger logger;
	static MyList myList = myList1 -> {
		myList1.sort(Comparator.comparing(Employee::getName));
		return myList1;
	};

	static {
		logger = Logger.getLogger(SortEmployeeAlphabeticallyTestWithLambda.class.getName());
	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("David", 104));
		employees.add(new Employee("Charlie", 103));
		employees.add(new Employee("Alice", 101));
		employees.add(new Employee("Bob", 102));

		logger.log(Level.INFO, "order of the List before sort is: {0}\n",
				employees.stream().map(Employee::getName).collect(Collectors.toList()));

		myList.sortAlphabetically((employees));

		logger.log(Level.INFO, "order of the List after sort is: {0}\n",
				employees.stream().map(Employee::getName).collect(Collectors.toList()));
	}

}