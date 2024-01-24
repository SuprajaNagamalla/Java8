package Reviews.java.eight.practice.by.ashok.example11;

import java.util.Comparator;


class DescendingNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e2.getName().compareTo(e1.getName());
	}
}
