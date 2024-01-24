package Runners;

import com.epam.java8.models.Employee;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestCharCountInGivenString {
    public static void main(String[] args) {
        String input = "testing of char count";
        char[] inputArray = input.toCharArray();
        int count=1;
        ArrayList<String> charList = new ArrayList<String>();

        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        HashMap<Character, Integer> charcterCount = new HashMap<Character, Integer>();
        for(char ch:inputArray){
//            charList.add(ch+" "+count);
//            if(charList.contains(ch)){
//                charcterCount.put(ch,count++);
//            }else{
//                charcterCount.put(ch,count);
//            }

            if(charCount.containsKey(ch)) {
                charCount.put(ch, charCount.get(ch)+1);
            }
            else {
                charCount.put(ch, 1);
            }

        }
//        System.out.println("charcterCount::"+charcterCount);
        System.out.println("Character count::"+charCount);

        System.out.println("Test sorting on Employee objects");
        Employee e1 =new Employee("test", "hdfc", 4546.56);
        Employee e2 =new Employee("test2", "icici", 94546.54);
        Employee e3 =new Employee("test3", "sbh", 45000.60);
        Employee e4 =new Employee("test4", "axis", 4546.56);
        HashMap<String, com.epam.java8.models.Employee> employees = new HashMap<String, com.epam.java8.models.Employee>();
        employees.put(e1.getName(), e1);
        employees.put(e2.getName(), e2);
        employees.put(e3.getName(), e3);
        employees.put(e4.getName(), e4);

        //Map<String, List<Employee>> salaryGreaterThan40k =  employees.entrySet().stream().filter(map->(map.getValue()).getSalary()>40000).collect(Collectors.toMap(String, Employee));

    }

}
