package com.epam.java8.lambdas;

import com.epam.java8.models.Employee;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaExpressions2 {

    public static double average(List<Integer> integerList) {
        OptionalDouble optionalDouble = integerList.stream().mapToInt(Integer::intValue).average();
        return optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0.0;
        //listOfIntegers.stream().mapToInt(Integer::intValue).average().orElse(-1);
    }

    public static String getStringOfEvenAndOddNumbers(List<Integer> integerList) {
        return integerList.stream().map(val -> val % 2 == 0 ? "e" + val : "o" + val).collect(Collectors.toList()).toString();
    }

    public static List<String> search(List<String> stringList, Predicate<String> predicate) {
        return stringList.stream().filter(predicate).collect(Collectors.toList());
    }

    public static String[] sortArrayByLength(String[] strings) {
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        Arrays.sort(strings, (stringOne, stringTwo) -> stringOne.length() - stringTwo.length());
        return strings;
    }

    public static String[] sortArrayByLengthInReverseOrder(String[] strings) {
        Arrays.sort(strings, Comparator.comparingInt(String::length).reversed());
        //Arrays.sort(strings,  (stringOne,stringTwo) ->stringTwo.length()-stringOne.length());
        return strings;
    }

    public static String[] sortArrayByFirstCharacter(String[] strings) {
        Arrays.sort(strings, Comparator.comparingInt(stringOne -> stringOne.charAt(0)));
        //Arrays.sort(strings, (stringOne,stringTwo) ->stringOne.charAt(0)-stringTwo.charAt(0));
        return strings;
    }

    public static String[] sortArrayByStartingWith(String[] strings, String subString) {
        Arrays.sort(strings, (stringOne, stringTwo) -> {
            if (stringOne.startsWith(subString) && !stringTwo.startsWith(subString)) {
                return -1;
            } else if (!stringOne.startsWith(subString) && stringTwo.startsWith(subString)) {
                return 1;
            } else {
                return 0;
            }
        });
        //Arrays.sort(strings,Comparator.comparing(stringOne -> !stringOne.startsWith("e")));
        return strings;
    }

    //1. Check if a given string is a palindrome
    public static boolean isPalindrome(String originalText) {
        String tempString = originalText.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, tempString.length() / 2)
                .noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));

    }
    //2. Find the 2nd biggest number in the given list of numbers
    public static int secondBiggestNumberFromList(List<Integer> integerList){
        return integerList.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
    }

    //3. write a program to check if two strings are rotations of each other.
    public static boolean isRotationalStrings(String firstString, String secondString){
        BiFunction<String, String, Boolean> isRotationalStrings = (StringOne, StringTwo) -> {
            return (StringOne.length() == StringTwo.length()) && ((StringOne + StringOne).contains(StringTwo));
        };
       return  isRotationalStrings.apply(firstString, secondString);
    }
    //4. Use Runnable interface to start a new thread and print numbers from
    public static void printNumbersUsingRunnable() {
        Runnable runnable = () -> {
            System.out.println("Inside : " + Thread.currentThread().getName());
            for (int i = 0; i <= 20; i++) {
                System.out.println(i);
            }
        };

        runnable.run();
    }
    //5. Use Comparator interface to sort given list of numbers in reverse order
    public static List<Integer> sortNumbersUsingComparator(List<Integer> listNumbers){
      return listNumbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
    //6. Use Comparator interface to sort given list of Employees in the alphabetic order of their name
    public static List<Employee> sortEmployeeByName(List<Employee> listEmployees){
         listEmployees.sort(Comparator.comparing(Employee::getName));
         //Collections.sort(listEmployees, Comparator.comparing(Employee::getName));
        //listEmployees.sort((employeeOne, employeeTwo)->employeeOne.getName().compareTo(employeeTwo.getName()));
         return listEmployees;
    }
    //7. Create a TreeSet that sorts the given set of numbers in reverse order
    public static void sortTreeSetNumbersInReverse(){
        TreeSet<Integer> treeSetNumbers = new TreeSet<Integer>(Comparator.reverseOrder());
        treeSetNumbers.add(67);
        treeSetNumbers.add(627);
        treeSetNumbers.add(7);
        treeSetNumbers.add(6);
        treeSetNumbers.add(200);
        treeSetNumbers.add(17);
        System.out.println("Descending order of TreeSet Integers::"+treeSetNumbers);
    }

    //8. Create a TreeSet that sorts the given set of Employees in the alphabetic order of their name
    public static void sortTreeSetEmployeeByName(){
        TreeSet<Employee> treeSetEmployees = new TreeSet<Employee>(Comparator.comparing(Employee::getName));

        treeSetEmployees.add(new Employee("test", "43523464675", 34000.67));
        treeSetEmployees.add(new Employee("Automation", "43523464375", 34800.60));
        treeSetEmployees.add(new Employee("Test", "43523454675", 30000.67));
        treeSetEmployees.add(new Employee("automation", "43523468675", 56000.70));
        treeSetEmployees.add(new Employee("data", "44523464675", 23000.80));
        treeSetEmployees.add(new Employee("Data", "43533464675", 78000.67));

        treeSetEmployees.forEach(System.out::println);
    }
    //9. Create a TreeMap that sorts the given set of values in descending order
    public static void sortTreeMapByValuesDescending(){
        TreeMap<String, Integer> countryCodes = new TreeMap<String, Integer>();

        countryCodes.put("US", 1);
        countryCodes.put("IN", 91);
        countryCodes.put("UK", 21);
        countryCodes.put("CA", 31);
        countryCodes.put("BR", 11);

        final Map<String, Integer> sortMapByValue = countryCodes.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        sortMapByValue.forEach((key, value) -> System.out.println(key + " : " + value));
    }
    //10. Create a TreeMap that sorts the given set of employees in descending order of their name
    public static void sortEmployeesTreeMapByNameDescendingOrder() {
        TreeMap<Employee, Integer> employeeTreeMap = new TreeMap<Employee, Integer>(Comparator.comparing(Employee::getName).reversed());
        //TreeMap<Employee,Integer> employeeTreeMap = new TreeMap<Employee,Integer>((employeeOne,employeeTwo)->employeeOne.getName().compareTo(employeeTwo.getName()));
        employeeTreeMap.put(new Employee("Jackson", "HR", 65000.50), 67908);
        employeeTreeMap.put(new Employee("Eve", "IT", 50000.00), 5181);
        employeeTreeMap.put(new Employee("Smith", "Admin", 40000.00), 90781);
        //return employeeTreeMap;
        employeeTreeMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
