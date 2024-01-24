package com.epam.java8.functionalinterfaces.function;

import com.epam.java8.models.Product;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductFunction {
    public double calculateTotalPrice(List<Product> products) {
        Function<List<Product>, Double> totalPrice = productList -> productList.stream().mapToDouble(Product::getPrice).sum();
        return totalPrice.apply(products);
    }

    public double calculateTotalPriceWithPredicate(List<Product> products, Predicate<Product> productPredicate) {
        Function<List<Product>, Double> totalPriceFilterByPrice = productList -> productList.stream().
                filter(productPredicate).map(Product::getPrice).reduce(0.0, Double::sum);
        return totalPriceFilterByPrice.apply(products);
    }

    public List<Product> getAllProductsFilterByPriceAndCategory(List<Product> products, Predicate<Product> pricePredicate, Predicate<Product> categoryPredicate) {
        Function<List<Product>, List<Product>> allProductsByPriceAndCategory = productList -> productList.stream().filter(pricePredicate).
                filter(categoryPredicate).collect(Collectors.toList());
        return allProductsByPriceAndCategory.apply(products);
    }
}
