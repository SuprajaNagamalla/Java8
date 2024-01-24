package com.epam.java8.transactions;

import com.epam.java8.BaseTest;
import com.epam.java8.functionalinterfaces.predicate.TransactionPredicate;
import com.epam.java8.models.Product;
import com.epam.java8.models.Transactions;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TransactionsTest extends BaseTest {

    //Using Predicate
    @Test
    public void testGetAllGroceryTransactionsData() {
        List<Transactions> groceryTranData = transactions.stream().
                filter(TransactionPredicate.transactionsGroceryCategoryPredicate).
                collect(Collectors.toList());
        System.out.println(GREEN_BOLD + "Transactions data: " + RESET + "Get all the grocery transactions"
                + "\nInput:" + transactions
                + "\nOutput:" + groceryTranData + "\n");
    }

    //Without predicate
    @Test
    public void testGetAllGroceryTransactions() {
        System.out.println(BLUE_BOLD + "Transactions data: " + RESET + "Get all the grocery transactions count"
                + "\nInput:" + transactions
                + "\nOutput:" + transactions.stream().filter(t -> t.getType().
                equalsIgnoreCase("grocery")).count() + "\n");
    }

    @Test
    public void testGetAllGroceryTransactionsSortedByValue() {
        System.out.println(GREEN_BOLD + "Transactions data: " + RESET + "Get all the grocery transactions Sorted by value Desc"
                + "\nInput:" + transactions
                + "\nOutput:" + transactions.stream().filter(t -> t.getType().equalsIgnoreCase("grocery")).
                sorted(Comparator.comparing(Transactions::getValue).reversed()).
                map(Transactions::toString).collect(Collectors.toList()) + "\n");
    }

    @Test
    public void testGetAllGroceryTransactionsSortedByValueShowEach() {
        List<String> processedData = transactions.stream().filter(t -> t.getType().
                        equalsIgnoreCase("grocery")).
                sorted(Comparator.comparing(Transactions::getValue).reversed()).
                map(Transactions::toString).collect(Collectors.toList());

        System.out.println(GREEN_BOLD + "Transactions data: " + RESET + "Get all the grocery transactions Sorted by value Desc"
                + "\nInput:" + transactions
                + BLUE_BOLD + "\nOutput:" + processedData );
        System.out.println(GREEN_BOLD + "grocery Transactions data values calling forEach() on list: " + RESET);
        processedData.forEach(System.out::println);
    }

    @Test
    public void testGetAllGroceryTransactionsSortedDesc() {
        System.out.println(BLUE_BOLD + "Transactions data: " + RESET + "Get all the grocery transactions Sorted by value showing the Transactions Id"
                + "\nInput:" + transactions
                + "\nOutput:" + transactions.stream().filter(t -> t.getType().equalsIgnoreCase("grocery")).
                sorted(Comparator.comparing(Transactions::getValue).reversed()).
                map(Transactions::getId).collect(Collectors.toList()) + "\n");
    }

    //Reduce stream into single value
    @Test
    public void testReduceStreamToSingleValue() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);

        List<Integer> numbers2 = Arrays.asList(3,4,5);
        int mult = numbers2.stream().reduce(1, (a, b) -> a * b);
        System.out.println(BLUE_BOLD + "Converted the numbers data to: " + RESET + "Get the mult::"+mult);

        List<Integer> numbers3 = Arrays.asList(3,4,5);
        int increaseBy3 = numbers3.stream().reduce(0,(a,b)->a+3);
        System.out.println(BLUE_BOLD + "Converted the numbers data to: " + RESET + "Get the increaseBy3::"+increaseBy3+" numbers::"+numbers3);

                System.out.println(BLUE_BOLD + "Converted the numbers data to: " + RESET + "Get the Sum"
                + "\nInput:" + numbers
                + "\nOutput:" + sum);
        //Optional class usage
        Optional<String> optional = Optional.of("value");
        Optional<Character> flatMappedOptional = optional.flatMap(value -> Optional.of(value.charAt(0)));
        System.out.println(GREEN_BOLD + "flatMappedOptional: " + RESET + flatMappedOptional);
        System.out.println(GREEN_BOLD + "flatMappedOptional value: " + RESET + flatMappedOptional.get());


        Optional<String> optional2 = Optional.empty();
        String value = optional2.orElse("default value");
        System.out.println(BLUE_BOLD + "Providing a default value for an empty Optional object:  " + RESET + value);
    }

    @Test
    public void streamForEachTest() {
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

        // Using forEach(Consumer action) to
        // print the elements of stream
        // in reverse order
        System.out.println(BLUE_BOLD + "Using forEach(Consumer action) to print stream" + RESET);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    @Test
    public void testRegexforMasking(){
        String input="123-456-782 ";
        System.out.println("input data::"+input+"::check");
        input = input.replace("-","");

        System.out.println("input.prelace - with empty::"+input+"::check");
        input = input.replace(" ","");
        System.out.println("input.prelace space with empty"+input.replace(" ", "")+"::check");
        System.out.println(input.replaceAll(".(?=.{4})", "*"));
        String input2="123-456-782 ";
        input2.replace("-","").replace(" ", "");
        System.out.println("input.prelace - with empty and space with empty::"+input2+"::check");
    }
}
