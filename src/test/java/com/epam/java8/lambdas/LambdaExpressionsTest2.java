package com.epam.java8.lambdas;

import com.epam.java8.BaseTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class LambdaExpressionsTest2 extends BaseTest {
    @Test
    public void testAverage() {
        List<Integer> integerList = Arrays.asList(2, 9, 0, 5, 78, 9);
        System.out.println(GREEN_BOLD + "HomeTask_1: " + RESET + "Average of list of integers"
                + "\nInput:" + integerList.toString()
                + "\nOutput:" + LambdaExpressions2.average(integerList) + "\n");
        integerList = Collections.emptyList();
    }

    @Test
    public void testIdentifyEvenAndOddNumbers() {
        List<Integer> integerList = Arrays.asList(2, 9, 0, 5, 78, 9);
        System.out.println(GREEN_BOLD + "HomeTask_2: " + RESET + "String of Even and Odd numbers"
                + "\nInput:" + integerList.toString()
                + "\nOutput:" + LambdaExpressions2.getStringOfEvenAndOddNumbers(integerList) + "\n");
    }

    @Test
    public void testSearch() {
        List<String> stringList = Arrays.asList("Jack", "anee", "Ela", "ava", "mia", "Abi", "joe", "aTh", "ami");
        System.out.println(GREEN_BOLD + "HomeTask_3: " + RESET + " Search strings start with the letter 'a' and have exactly 3 letters"
                + "\nInput:" + stringList.toString()
                + "\nOutput:" + LambdaExpressions2.search(stringList, val -> (val.startsWith("a") && val.length() == 3)) + "\n");
    }

    @Test
    public void testSortArrayByLength() {
        String[] strings = {"Jack", "anee", "Oliver", "Alexander", "Li", "Michelle", "joe", "aTh", "ami", "Patricia", "Linda"};
        System.out.println(GREEN_BOLD + "HomeTask_4_1: " + RESET + "Sort array of strings from shortest to longest"
                + "\nInput:" + Arrays.toString(strings)
                + "\nOutput:" + Arrays.toString(LambdaExpressions2.sortArrayByLength(strings)) + "\n");
    }

    @Test
    public void testSortArrayByLengthInReverseOrder() {
        String[] strings = {"Jack", "anee", "Oliver", "Alexander", "Li", "Michelle", "joe", "aTh", "ami", "Patricia", "Linda"};
        System.out.println(GREEN_BOLD + "HomeTask_4_2: " + RESET + "Sort array of strings from longest to shortest"
                + "\nInput:" + Arrays.toString(strings)
                + "\nOutput:" + Arrays.toString(LambdaExpressions2.sortArrayByLengthInReverseOrder(strings)) + "\n");
    }

    @Test
    public void testSortArrayByFirstCharacter() {
        String[] strings = {"Jack", "anee", "Oliver", "Alexander", "Li", "Michelle", "joe", "aTh", "ami", "Patricia", "Linda"};
        System.out.println(GREEN_BOLD + "HomeTask_4_3: " + RESET + "Sort array of strings alphabetically by the first character"
                + "\nInput:" + Arrays.toString(strings)
                + "\nOutput:" + Arrays.toString(LambdaExpressions2.sortArrayByFirstCharacter(strings)) + "\n");
    }

    @Test
    public void testSortArrayByStartingWith() {
        String[] strings = {"Jack", "anee", "Oliver", "ella", "Li", "Michelle", "Emma", "eMily", "ami", "evans", "Linda"};
        System.out.println(GREEN_BOLD + "HomeTask_4_4: " + RESET + "Sort array of strings with “e” first, everything else second"
                + "\nInput:" + Arrays.toString(strings)
                + "\nOutput:" + Arrays.toString(LambdaExpressions2.sortArrayByStartingWith(strings, "e")) + "\n");
    }


    @Test
    public void testIsPalindrome() {
        String input = "RADAR";
        System.out.println(GREEN_BOLD + "HomeTask_1_1: " + RESET + "Check if a given string is a palindrome"
                + "\nInput:" + "abba"
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
