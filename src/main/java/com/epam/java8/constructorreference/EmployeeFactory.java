package com.epam.java8.constructorreference;

public interface EmployeeFactory<Employee> {
    public Employee getEmployee(String name, String account, Double salary);
}
