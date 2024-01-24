package SampleCodingPrograms;

import com.epam.java8.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestStreams {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("test1", "icici",34500.00));
        employees.add(new Employee("test2", "hdfc",44500.00));
        employees.add(new Employee("test3", "sbi",64500.00));
        employees.add(new Employee("test4", "axis",104500.00));
        employees.add(new Employee("test5", "hsbc",204500.00));
        employees.add(new Employee("test5", "hsbc",24500.00));
        employees.add(new Employee("test5", "sbi",45000.00));

       List<Employee> sortedDescendingSalaryEmployee = employees.stream().sorted((e1,e2)->Double.compare(e2.getSalary(), e1.getSalary())).collect(Collectors.toList());
        for (Employee e:sortedDescendingSalaryEmployee) {
            System.out.println(e);
        }

        //filters using account type
        long countOfSbiAccountEmployees = employees.stream().filter(e->e.getAccount().equalsIgnoreCase("sbi")).collect(Collectors.toList()).size();
        System.out.println("count of sbi employees::"+countOfSbiAccountEmployees);
        //Count of Employes group by accounts
        Map<String, Long> countOfEmployeeAccounts = employees.stream().map(e->e.getAccount())
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("countOfEmployeeAccounts::"+countOfEmployeeAccounts);
    }
}
