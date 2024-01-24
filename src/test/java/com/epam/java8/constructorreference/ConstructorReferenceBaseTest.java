package com.epam.java8.constructorreference;

import com.epam.java8.BaseTest;
import com.epam.java8.models.Employee;
import org.testng.annotations.Test;

public class ConstructorReferenceBaseTest extends BaseTest {
    @Test
    public void testEmployeeConstructorReference() {
        EmployeeFactory<Employee> employeeFactory = Employee::new;
        Employee employee=employeeFactory.getEmployee("Mary", "Payroll", 65000.50);
        System.out.println(GREEN_BOLD + "HomeTask_7_1: " + RESET + "Get the details of Employee Object using constructor reference"
                + "\nOutput:" + employee + "\n");
    }
}
