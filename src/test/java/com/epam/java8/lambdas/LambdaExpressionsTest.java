package com.epam.java8.lambdas;

import com.epam.java8.BaseTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class LambdaExpressionsTest extends BaseTest {

    @Test
    public void testIsPalindrome() {
        String input = "RADAR";
        System.out.println(GREEN_BOLD + "HomeTask_1_1: " + RESET + "Check if a given string is a palindrome"
                + "\nInput:" + "RADAR"
                + "\nOutput:" + LambdaExpressions.isPalindrome(input) + "\n");
    }

    @Test
    public void testGetSecondLargestNumber() {
        List<Integer> integers = Arrays.asList(15, 56, 1, 4, 78, 14, 67);
        System.out.println(GREEN_BOLD + "HomeTask_1_2: " + RESET + "2nd biggest number in the given list of numbers"
                + "\nInput:" + integers
                + "\nOutput:" + LambdaExpressions.secondBiggestNumberFromList(integers) + "\n");
    }

    @Test
    public void testStringRotations() {
        String stringOne = "abad";
        String stringTwo = "adab";
        System.out.println(GREEN_BOLD + "HomeTask_1_3: " + RESET + "Check if two strings are rotations of each other"
                + "\nInput: " + stringOne + ", " + stringTwo
                + "\nOutput:" + LambdaExpressions.isRotationalStrings(stringOne, stringTwo) + "\n");
    }

    @Test
    public void testRunnableLambda() {
        System.out.println(GREEN_BOLD + "HomeTask_1_4: " + RESET + "Runnable interface to start a new thread and print numbers"
                + "\nOutput:");
        LambdaExpressions.printNumbersUsingRunnable();
    }

    @Test
    public void testSortValuesInReverseOrder() {
        List<Integer> integers = Arrays.asList(15, 56, 1, 4, 78, 14, 67);
        System.out.println(GREEN_BOLD + "HomeTask_1_5: " + RESET + "Comparator interface to sort given list of numbers in reverse order"
                + "\nInput:" + integers
                + "\nOutput:" + LambdaExpressions.sortNumbersUsingComparator(integers) + "\n");
    }

    @Test
    public void testSortEmployeesByName() {
        System.out.println(GREEN_BOLD + "HomeTask_1_6: " + RESET + "Comparator interface to sort given list of Employees in the alphabetic order of their name"
                + "\nInput:" + employees
                + "\nOutput:" + LambdaExpressions.sortEmployeeByName(employees) + "\n");

    }

    @Test
    public void testSortTreeSetValuesInReverseOrder() {
        System.out.println(GREEN_BOLD + "HomeTask_1_7: " + RESET + "Create a TreeSet that sorts the given set of numbers in reverse order"
                + "\nOutput:");
        LambdaExpressions.sortTreeSetNumbersInReverse();
    }

    @Test
    public void testSortTreeSetOfEmployeesByName() {
        System.out.println(GREEN_BOLD + "HomeTask_1_8: " + RESET + "Create a TreeSet that sorts the given set of Employees in the alphabetic order of their name"
                + "\nOutput:");
        LambdaExpressions.sortTreeSetEmployeeByName();
    }

    @Test
    public void testSortTreeMapValuesInDescendingOrder() {
        System.out.println(GREEN_BOLD + "HomeTask_1_9: " + RESET + "Create a TreeMap that sorts the given set of values in descending order"
                + "\nOutput:");
        LambdaExpressions.sortTreeMapByValuesDescending();
    }

    @Test
    public void testSortEmployeesByNameForTreeMap() {
        System.out.println(GREEN_BOLD + "HomeTask_1_10: " + RESET + "Create a TreeMap that sorts the given set of employees in descending order of their name"
                + "\nOutput:");
        LambdaExpressions.sortEmployeesTreeMapByNameDescendingOrder();
    }
}
