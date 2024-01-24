package com.epam.java8;

import com.epam.java8.models.*;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BaseTest {

    public static final String RESET = "\033[0m";
    public static final String GREEN_BOLD = "\033[1;32m"; //green:\u001B[32m blue:\u001B[34m
    public static final String BLUE_BOLD = "\033[1;34m";
    protected List<Product> products = null;
    protected HashMap<Product, Integer> shoppingCart = null;
    protected List<Response> responses = null;
    protected List<Employee> employees = null;
    protected List<Transactions> transactions = null;

    @BeforeClass
    public void setUp() {
        products = List.of(new Product("Apple", 234.1, Category.ELECTRONICS, "Very Good"),
                new Product("Orange", 20, Category.FRUIT, "Very Good"),
                new Product("LED Monitor", 20000.00, Category.ELECTRONICS, "Good"),
                new Product("Buddha Idol", 900.00, Category.HOME_APPLIANCES, "Very Good"),
                new Product("Keyboard", 3000.00, Category.ELECTRONICS, "Very Good"),
                new Product("Geared Cycles", 1000.34, Category.SPORTS, "Very Good"),
                new Product("Pen Set", 200.50, Category.STATIONARY, "Good"));

        JsonNodeFactory nodeFactory = JsonNodeFactory.instance;
        ObjectNode rootNode = nodeFactory.objectNode();
        ObjectNode productNode = nodeFactory.objectNode();
        productNode.put("name", "Keyboard");
        productNode.put("price", "3000.00");
        productNode.put("category", "Electronics");
        rootNode.set("Product", productNode);

        responses = new ArrayList<Response>() {{
            add(new Response(rootNode.toString(), 200, "application/json"));
            add(new Response(rootNode.toString(), 404, "application/json"));
            add(new Response(rootNode.toString(), 500, "application/json"));
            add(new Response(rootNode.toString(), 400, "application/json"));
            add(new Response("XML", 400, "application/xml"));
        }};

        shoppingCart = new HashMap<Product, Integer>() {{
            put(new Product("Orange", 20, Category.FRUIT, "Very Good"), 10);
            put(new Product("LED Monitor", 20000.00, Category.ELECTRONICS, "Good"), 2);
            put(new Product("Buddha Idol", 900.00, Category.HOME_APPLIANCES, "Very Good"), 3);
            put(new Product("Geared Cycles", 1000.34, Category.SPORTS, "Very Good"), 1);
            put(new Product("Pencil Box", 40.50, Category.STATIONARY, "Very Good"), 4);
        }};

        employees = new ArrayList<>(Arrays.asList(new Employee("Jackson", "HR", 65000.50),
                new Employee("Li", "Accounts", 50500.00),
                new Employee("Smith", "Admin", 40000.00),
                new Employee("Eve", "IT", 50000.00)));

        transactions = new ArrayList<>(Arrays.asList(new Transactions(1, "credit", 65000.60),
                new Transactions(3, "grocery", 80),
                new Transactions(6, "grocery", 120),
                new Transactions(7, "credit", 1000.40),
                new Transactions(10, "grocery", 50)));
    }
}
