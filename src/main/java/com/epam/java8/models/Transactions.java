package com.epam.java8.models;

import java.util.ArrayList;
import java.util.List;

public class Transactions {
    private int id;
    private String type;
    private double value;

    public Transactions(int id, String type, double value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("Transactions{id=%s, type=%s, value=%s}", id, type, value);
    }


}
