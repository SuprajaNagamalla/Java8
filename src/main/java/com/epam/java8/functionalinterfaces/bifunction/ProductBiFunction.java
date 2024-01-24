package com.epam.java8.functionalinterfaces.bifunction;

import com.epam.java8.models.Product;

import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ProductBiFunction {
    public Product createProduct(String name, double price) {
        BiFunction<String, Double, Product> biFnCreateProduct = (prdName, prdPrice) -> new Product(prdName, prdPrice);
        return biFnCreateProduct.apply(name, price);
    }

    public Double calculateCostOfProduct(Product product, int quantity) {
        BiFunction<Product, Integer, Double> biFnCostOfProduct = (prd, qty) -> prd.getPrice() * qty;
        return biFnCostOfProduct.apply(product, quantity);
    }

    public Double calculateCostOfCart(HashMap<Product, Integer> cart) {
        Function<HashMap<Product, Integer>, Double> costOfCart = (shoppingCart) ->
                shoppingCart.entrySet().stream().mapToDouble(e -> e.getKey().getPrice() * e.getValue()).sum();
        return costOfCart.apply(cart);
    }
}
