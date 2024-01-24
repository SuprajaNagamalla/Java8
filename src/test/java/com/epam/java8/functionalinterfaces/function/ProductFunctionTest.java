package com.epam.java8.functionalinterfaces.function;

import com.epam.java8.BaseTest;
import com.epam.java8.functionalinterfaces.predicate.ProductPredicate;
import org.testng.annotations.Test;

public class ProductFunctionTest extends BaseTest {
    ProductFunction productFunction = new ProductFunction();

    @Test
    public void testCalculateTotalPrice() {
        System.out.println(GREEN_BOLD + "HomeTask_3_1: " + RESET + "Calculate the cost of all products in a given list of products"
                + "\nInput:" + products
                + "\nOutput:" + productFunction.calculateTotalPrice(products) + "\n");
    }

    @Test
    public void testCalculateTotalPriceFilterByPrice() {
        System.out.println(GREEN_BOLD + "HomeTask_3_2: " + RESET + "Calculate the cost of all products whose prices is > 1000/-"
                + "\nInput:" + products
                + "\nOutput:" + productFunction.calculateTotalPriceWithPredicate(products, ProductPredicate.priceGreaterThan1000Predicate) + "\n");
    }

    @Test
    public void testCalculateTotalPriceFilterByCategory() {
        System.out.println(GREEN_BOLD + "HomeTask_3_3: " + RESET + "Calculate the cost of all electronic products"
                + "\nInput:" + products
                + "\nOutput:" + productFunction.calculateTotalPriceWithPredicate(products, ProductPredicate.electronicsCategoryPredicate) + "\n");
    }

    @Test
    public void testCalculateTotalPriceFilterByPriceAndCategory() {
        System.out.println(GREEN_BOLD + "HomeTask_3_4: " + RESET + "Get all the products whose price is is > 1000/- and belongs to electronic category"
                + "\nInput:" + products
                + "\nOutput:" + productFunction.getAllProductsFilterByPriceAndCategory(products, ProductPredicate.priceGreaterThan1000Predicate,
                ProductPredicate.electronicsCategoryPredicate) + "\n");
    }
}