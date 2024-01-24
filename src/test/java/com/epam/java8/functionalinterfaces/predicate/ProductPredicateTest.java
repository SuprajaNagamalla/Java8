package com.epam.java8.functionalinterfaces.predicate;

import com.epam.java8.BaseTest;
import org.testng.annotations.Test;

public class ProductPredicateTest extends BaseTest {
    ProductPredicate productPredicate = new ProductPredicate();

    @Test
    public void testPrintAllProductsByPrice() {
        System.out.println(GREEN_BOLD + "HomeTask_2_1: " + RESET + "Print all the products from the given list of the products if the price is greater than 1000/-"
                + "\nInput:" + products
                + "\nOutput:" + productPredicate.filterProductsByPredicate(products, ProductPredicate.priceGreaterThan1000Predicate) + "\n");
    }

    @Test
    public void testPrintAllProductsByCategory() {
        System.out.println(GREEN_BOLD + "HomeTask_2_2: " + RESET + "Print all the products from the given list of the products if the product is of electronics category"
                + "\nInput:" + products
                + "\nOutput:" + productPredicate.filterProductsByPredicate(products, ProductPredicate.electronicsCategoryPredicate) + "\n");
    }

    @Test
    public void testPrintAllProductsByPriceNCategory() {
        System.out.println(GREEN_BOLD + "HomeTask_2_3: " + RESET + "Print all the products from the given list of product if the product price is greater than 100/- which are in electronics category"
                + "\nInput:" + products
                + "\nOutput:" + productPredicate.filterProductsByPredicate(products, ProductPredicate.priceGreaterThan100NCategoryElectronicsPredicate) + "\n");
    }

    @Test
    public void testPrintAllProductsByPriceRCategory() {
        System.out.println(GREEN_BOLD + "HomeTask_2_4: " + RESET + "Print all the products from the given list of product if the product price is greater than 100/- or product is in electronics category"
                + "\nInput:" + products
                + "\nOutput:" + productPredicate.filterProductsByPredicate(products, ProductPredicate.priceGreaterThan100RCategoryElectronicsPredicate) + "\n");
    }

    @Test
    public void testPrintAllProductsByPriceLessThanNCategory() {
        System.out.println(GREEN_BOLD + "HomeTask_2_5: " + RESET + "Print all the products from the given list of product if the product price is less 100/- and product is in electronics category"
                + "\nInput:" + products
                + "\nOutput:" + productPredicate.filterProductsByPredicate(products, ProductPredicate.priceLessThan100NCategoryElectronicsPredicate) + "\n");
    }


}
