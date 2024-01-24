package com.epam.java8.functionalinterfaces.supplier;

import com.epam.java8.models.Product;

import java.awt.*;
import java.util.List;
import java.util.function.Supplier;

public class ProductSupplier {
    public Product getRandomProduct(List<Product> products) {
        Supplier<Product> randomProduct = () -> {
            int index = (int) (Math.random() * products.size());
            return products.get(index);
        };
        return randomProduct.get();
    }

    public String getRandomOTP(int noOfChars) {
        Supplier<String> randomOTP = () -> {
            String otp = "";
            for (int i = 1; i <= noOfChars; i++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };
        return randomOTP.get();
    }
}
