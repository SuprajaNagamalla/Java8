package Reviews.java.eight.practice.by.ashok.example6;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Employee {
	private String name;
	private int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
}

