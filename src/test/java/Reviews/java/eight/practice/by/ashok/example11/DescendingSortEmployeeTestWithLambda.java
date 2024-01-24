package Reviews.java.eight.practice.by.ashok.example11;


import Reviews.java.eight.practice.by.ashok.example8.SortEmployeeAlphabeticallyTest;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

//import java.eight.practice.by.ashok.example8.SortEmployeeAlphabeticallyTest;


public class DescendingSortEmployeeTestWithLambda {

	static Logger logger;

	static {
		logger = Logger.getLogger(SortEmployeeAlphabeticallyTest.class.getName());
	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "John"));
		employees.add(new Employee(2, "Alice"));
		employees.add(new Employee(3, "Bob"));
		employees.add(new Employee(4, "Zoe"));
		employees.add(new Employee(5, "Charlie"));

		Collections.sort(employees, (e1, e2) -> e2.getName().compareTo(e1.getName()));

		String joinedString = String.join("\n", employees.stream().map(Employee::toString).toArray(String[]::new));
		logger.log(Level.INFO, joinedString);
	}
}