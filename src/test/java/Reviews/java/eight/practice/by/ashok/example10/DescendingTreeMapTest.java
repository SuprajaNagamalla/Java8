package Reviews.java.eight.practice.by.ashok.example10;

import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DescendingTreeMapTest {

	static Logger logger;

	static {
		logger = Logger.getLogger(DescendingTreeMapTest.class.getName());
	}

	public static void main(String[] args) {

		TreeMap<Employee, Integer> descendingTreeMap = new TreeMap<>(new DescendingNameComparator());

		descendingTreeMap.put(new Employee(1, "John"), 1001);
		descendingTreeMap.put(new Employee(2, "Alice"), 1002);
		descendingTreeMap.put(new Employee(3, "Bob"), 1003);
		descendingTreeMap.put(new Employee(4, "Zoe"), 1004);
		descendingTreeMap.put(new Employee(5, "Charlie"), 1005);

		for (Map.Entry<Employee, Integer> entry : descendingTreeMap.entrySet()) {
			logger.log(Level.INFO, entry.getKey() + " => " + entry.getValue());
		}
	}
}

