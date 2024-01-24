package com.epam.java8.functionalinterfaces.primitives;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class PrimitiveInterfaces {
    public boolean isPrime(int number) {
        IntPredicate isDivisible = value -> value > 1 && IntStream.range(2, value - 1)
                .noneMatch(i -> value % i == 0);
        return isDivisible.test(number);
    }

    public void square(int number) {
        IntConsumer displaySquare = num -> System.out.print(num * num);
        displaySquare.accept(number);
    }

    public int randomInt(int maxRange) {
        IntSupplier randomValue = () -> new Random().nextInt(maxRange);
        return randomValue.getAsInt();
    }


}
