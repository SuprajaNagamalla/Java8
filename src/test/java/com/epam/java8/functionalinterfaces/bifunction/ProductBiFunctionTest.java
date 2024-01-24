package com.epam.java8.functionalinterfaces.bifunction;

import com.epam.java8.BaseTest;
import com.epam.java8.models.Product;
import org.testng.annotations.Test;

import static com.epam.java8.BaseTest.GREEN_BOLD;
import static com.epam.java8.BaseTest.RESET;

public class ProductBiFunctionTest extends BaseTest {
    private ProductBiFunction productBiFunction = new ProductBiFunction();

    @Test
    public void testCreateProduct() {
        System.out.println(GREEN_BOLD + "HomeTask_5_1: " + RESET + "Given the name and price of the product, write a Bifunction to create a product"
                + "\nInput:" + "Product Name: SpiderMan Trolley Bag, Product Price: 2499.25"
                + "\nOutput:" + productBiFunction.createProduct("SpiderMan Trolley Bag", 2499.25) + "\n");
    }

    @Test
    public void testCalculateCostOfProduct() {
        Product product = products.stream().filter(prd -> prd.getName().equals("Buddha Idol")).findAny()
                .orElse(null);
        int quantity = 4;
        System.out.println(GREEN_BOLD + "HomeTask_5_2: " + RESET + "Given the Product and quantity of the products, write a BiFunction to calculate the cost of products"
                + "\nInput:" + product + " \nQuantity " + quantity
                + "\nOutput:" + productBiFunction.calculateCostOfProduct(product, quantity) + "\n");
    }

    @Test
    public void testCalculateCostOfCart() {
        System.out.println(GREEN_BOLD + "HomeTask_5_3: " + RESET + "A cart is a map of product and quantity. Given the cart, calculate the cost of the cart"
                + "\nInput:" + shoppingCart.toString()
                + "\nOutput:" + productBiFunction.calculateCostOfCart(shoppingCart) + "\n");
    }
}