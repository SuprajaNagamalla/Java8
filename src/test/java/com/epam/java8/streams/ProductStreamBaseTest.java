package com.epam.java8.streams;

import com.epam.java8.BaseTest;
import com.epam.java8.functionalinterfaces.predicate.ProductPredicate;
import com.epam.java8.models.Category;
import org.testng.annotations.Test;

public class ProductStreamBaseTest extends BaseTest{
    ProductStream productStream = new ProductStream();

    @Test
    public void testGetAllProductsByPrice() {
        System.out.println(GREEN_BOLD + "HomeTask_8_1: " + RESET + "Get all the products with price > 1000/-"
                + "\nInput:" + products
                + "\nOutput:" + productStream.getAllProducts(products, ProductPredicate.priceGreaterThan1000Predicate) + "\n");
    }

    @Test
    public void testGetAllProductsByCategory() {
        System.out.println(GREEN_BOLD + "HomeTask_8_2: " + RESET + "Get all the products from electronics category"
                + "\nInput:" + products
                + "\nOutput:" + productStream.getAllProducts(products, ProductPredicate.electronicsCategoryPredicate) + "\n");
    }

    @Test
    public void testGetAllProductsByAndCategory() {
        System.out.println(GREEN_BOLD + "HomeTask_8_3: " + RESET + "Get all the products with price> 1000/- and from electronics category"
                + "\nInput:" + products
                + "\nOutput:" + productStream.getAllProducts(products, ProductPredicate.priceGreaterThan1000NCategoryElectronicsPredicate) + "\n");
    }

    @Test
    public void testGetCountOfAllProductsByCategory() {
        System.out.println(GREEN_BOLD + "HomeTask_8_4: " + RESET + "Count of all electronic products"
                + "\nInput:" + products
                + "\nOutput:" + productStream.getCountOfAllProductsByCategory(products, Category.ELECTRONICS) + "\n");
    }
}