package Reviews.java.eight.practice.by.ashok.example10;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Employee {
	private String name;
	private int id;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}

