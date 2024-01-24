package com.epam.java8.functionalinterfaces.consumer;

import com.epam.java8.BaseTest;
import com.epam.java8.models.Category;
import com.epam.java8.models.Product;
import org.testng.annotations.Test;

public class ProductConsumerTest extends BaseTest {
    ProductConsumer productConsumer = new ProductConsumer();

    @Test
    public void testPrintProduct() {
        Product product = new Product("USB HeadSet", 2000.00, Category.ELECTRONICS, "Very Good");
        boolean printToFile = false;
        System.out.print(GREEN_BOLD + "HomeTask_4_1: " + RESET + "Given a product write a consumer to print the product to appropriate medium depending on the print parameter"
                + "\nInput:" + product + ", printToFile:" + printToFile + "\n Output:");
        productConsumer.printProduct(product, printToFile);
        System.out.println("\n");
    }

    @Test
    public void testUpdateGradeOfProductFilterByPrice() {
        System.out.println(GREEN_BOLD + "HomeTask_4_2: " + RESET + "Consumer to update the grade of the product as 'Premium' if the price is > 1000/-"
                + "\nInput:" + products
                + "\nOutput:" + productConsumer.updateGradeOfProductFilterByPrice(products, 1000) + "\n");
    }

    @Test
    public void testUpdateNameOfProductFilterByPrice() {
        System.out.println(GREEN_BOLD + "HomeTask_4_3: " + RESET + "Consumer to update the name of the product to be suffixed with '*' if the price of product is > 3000/-"
                + "\nInput:" + products
                + "\nOutput:" + productConsumer.updateNameOfProductFilterByPrice(products, 3000) + "\n");
    }

    @Test(dependsOnMethods = {"testUpdateGradeOfProductFilterByPrice", "testUpdateNameOfProductFilterByPrice"})
    public void testPrintAllProductsFilterByGradeNName() {
        System.out.print(GREEN_BOLD + "HomeTask_4_4: " + RESET + "Print all the Premium grade products with name suffixed with '*'"
                + "\nInput:" + products + "\n Output:");
        productConsumer.printAllProductsFilterByGradeNName(products, "Premium", "*");
        System.out.println("\n");
    }
}