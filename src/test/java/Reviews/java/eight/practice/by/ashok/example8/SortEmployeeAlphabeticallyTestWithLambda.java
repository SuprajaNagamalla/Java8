package Reviews.java.eight.practice.by.ashok.example8;

import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;


public class SortEmployeeAlphabeticallyTestWithLambda {

	static Logger logger;

	static {
		logger = Logger.getLogger(SortEmployeeAlphabeticallyTestWithLambda.class.getName());
	}

	
	public static void main(String[] args) {
		TreeSet<Employee> employees = new TreeSet<>(
				(e1, e2) -> e1.getName().compareTo(e2.getName())
		);
		employees.add(new Employee("David", 104));
		employees.add(new Employee("Charlie", 103));
		employees.add(new Employee("Alice", 101));
		employees.add(new Employee("Bob", 102));

		logger.log(Level.INFO, "order of the tree set is: {0}\n", employees.stream().map(Employee::getName).collect(Collectors.toList()));
	}

}