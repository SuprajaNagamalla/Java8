package com.epam.java8.models;

import java.io.Serializable;

public class Product implements Serializable    {
        private static final long serialVersionUID = 2165862413068928773L;
        private  static final long getSerialVersionUID2= 234643654657657L;
        private String name;
        private double price;
        private Category category;
        private String grade;

    public Product(String name, double price, Category category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

        public String getName() {
        return name;
    }

        public void setName(String name) {
        this.name = name;
    }

        public double getPrice() {
        return price;
    }

        public void setPrice(double price) {
        this.price = price;
    }

        public Category getCategory() {
        return category;
    }

        public void setCategory(Category category) {
        this.category = category;
    }

        public String getGrade() {
        return grade;
    }

        public void setGrade(String grade) {
        this.grade = grade;
    }

        @Override
        public String toString() {
        return "Product {name=" + name + ", price=" + price + ", category=" + category + ", grade=" + grade + "}";
    }
    }