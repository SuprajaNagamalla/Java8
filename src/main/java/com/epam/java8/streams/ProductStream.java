package com.epam.java8.streams;

import com.epam.java8.models.Category;
import com.epam.java8.models.Product;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductStream {
    public List<Product> getAllProducts(List<Product> products, Predicate<Product> productPredicate) {
        return products.stream().filter(productPredicate).collect(Collectors.toList());
    }

    public long getCountOfAllProductsByCategory(List<Product> products, Category categoryToFilter) {
        return products.stream().map(Product::getCategory).filter(categoryToFilter::equals).count();
    }
}
