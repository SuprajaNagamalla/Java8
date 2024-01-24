package com.epam.java8.functionalinterfaces.supplier;

import com.epam.java8.BaseTest;
import org.testng.annotations.Test;

public class ProductSupplierBaseTest extends BaseTest {
    ProductSupplier productSupplier = new ProductSupplier();

    @Test
    public void testGetRandomProduct() {
        System.out.println(GREEN_BOLD + "HomeTask4_5_1: " + RESET + "Supplier to produce a random product"
                + "\nInput:" + products
                + "\nOutput:" + productSupplier.getRandomProduct(products) + "\n");
    }

    @Test
    public void testGetRandomOTP() {
        int noOfChars = 6;
        System.out.println(GREEN_BOLD + "HomeTask_4_5_2: " + RESET + "Supplier to produce a random OTP"
                + "\nInput: OTPLength=" + noOfChars
                + "\nOutput:" + productSupplier.getRandomOTP(noOfChars) + "\n");
    }
}