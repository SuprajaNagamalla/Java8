package com.epam.java8.models;

public class EmployeeSaralyComparator {
    private String name;
    private String account;
    private double salary;

    public EmployeeSaralyComparator(String name, String account, double salary) {
        this.name = name;
        this.account = account;
        this.salary = salary;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee [name=%s, account=%s, salary=%s]", name, account, salary);
    }
}
