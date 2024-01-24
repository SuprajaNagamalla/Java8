package com.epam.java8.functionalinterfaces.primitives;

import com.epam.java8.BaseTest;
import org.testng.annotations.Test;

public class PrimitiveInterfacesBaseTest extends BaseTest {
    PrimitiveInterfaces primitiveInterfaces = new PrimitiveInterfaces();

    @Test
    public void testIsPrime() {
        System.out.println(GREEN_BOLD + "HomeTask_6_1: " + RESET + "IntPredicate to verify if the given number is a prime number"
                + "\nInput:" + 24
                + "\nOutput:" + primitiveInterfaces.isPrime(29) + "\n");
    }

    @Test
    public void testSquare() {
        System.out.print(GREEN_BOLD + "HomeTask_6_2: " + RESET + "IntConsumer to print square of the given number"
                + "\nInput:" + 34
                + "\nOutput:");
        primitiveInterfaces.square(34);
        System.out.println("\n");
    }

    @Test
    public void testRandomInt() {
        System.out.println(GREEN_BOLD + "HomeTask_6_3: " + RESET + "IntSupplier to give random int below 5000"
                + "\nOutput:" + primitiveInterfaces.randomInt(5000) + "\n");
    }
}