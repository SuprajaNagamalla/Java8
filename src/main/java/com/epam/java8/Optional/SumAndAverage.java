package com.epam.java8.Optional;

import com.epam.java8.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class SumAndAverage {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Joe", 55));
        persons.add(new Person("Moe", 33));
        persons.add(new Person("Hill", 94));

        OptionalDouble average = persons.stream().mapToInt(p -> p.getAge()).average();

        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        } else {
            System.out.println("Could not calculate average.");
        }
    }
}