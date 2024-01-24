package com.epam.java8.functionalinterfaces.predicate;

import com.epam.java8.models.Category;
import com.epam.java8.models.Product;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductPredicate {

    public static Predicate<Product> priceGreaterThan1000Predicate = product -> product.getPrice() > 1000;
    public static Predicate<Product> electronicsCategoryPredicate = product -> product.getCategory().equals(Category.ELECTRONICS);
    public static Predicate<Product> priceGreaterThan1000NCategoryElectronicsPredicate = product ->
            (product.getPrice() > 1000 && product.getCategory().equals(Category.ELECTRONICS));
    public static Predicate<Product> priceGreaterThan100NCategoryElectronicsPredicate = product ->
            (product.getPrice() > 100 && product.getCategory().equals(Category.ELECTRONICS));
    public static Predicate<Product> priceGreaterThan100RCategoryElectronicsPredicate = product ->
            (product.getPrice() > 100 || product.getCategory().equals(Category.ELECTRONICS));
    public static Predicate<Product> priceLessThan100NCategoryElectronicsPredicate = product ->
            (product.getPrice() < 100 && product.getCategory().equals(Category.ELECTRONICS));

    public static List<Product> filterProductsByPredicate(List<Product> products, Predicate<Product> productPredicate) {
        return products.stream().filter(productPredicate).collect(Collectors.toList());
    }

}
