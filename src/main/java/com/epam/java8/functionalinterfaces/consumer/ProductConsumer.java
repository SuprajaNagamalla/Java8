package com.epam.java8.functionalinterfaces.consumer;

import com.epam.java8.models.Product;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.function.Consumer;

public class ProductConsumer {
    public void printProduct(Product product, boolean printToFile) {
        Consumer<Product> printProduct = prd -> {
            if (printToFile) {
                try (FileOutputStream fileOutputStream = new FileOutputStream("src/test/resources/products.txt");
                     ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                    objectOutputStream.writeObject(product);
                    objectOutputStream.flush();
                    System.out.println("Successfully logged product details to file:" +
                            new File("src/test/resources/products.txt").getAbsolutePath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.print(product);
            }
        };
        printProduct.accept(product);
    }

    public List<Product> updateGradeOfProductFilterByPrice(List<Product> products, double priceToFilter) {
        Consumer<List<Product>> updateProductGrade = productList -> {
            productList.forEach(product -> {
                if (product.getPrice() > priceToFilter) {
                    product.setGrade("Premium");
                }
            });
        };
        updateProductGrade.accept(products);
        return products;
    }

    public List<Product> updateNameOfProductFilterByPrice(List<Product> products, double priceToFilter) {
        Consumer<List<Product>> updateProductGrade = productList -> {
            productList.forEach(product -> {
                if (product.getPrice() > priceToFilter) {
                    product.setName(product.getName() + "*");
                }
            });
        };
        updateProductGrade.accept(products);
        return products;
    }

    public void printAllProductsFilterByGradeNName(List<Product> products, String gradeToFilter, String nameEndsWith) {
        Consumer<List<Product>> printProducts = productList -> {
            productList.forEach(prd -> {
                if (prd.getGrade().equals(gradeToFilter) && prd.getName().endsWith(nameEndsWith)) {
                    System.out.println(prd);
                }
            });
        };
        printProducts.accept(products);
    }
}
