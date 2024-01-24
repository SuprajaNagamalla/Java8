package com.epam.java8.functionalinterfaces.predicate;



import com.epam.java8.models.Category;
import com.epam.java8.models.Transactions;

import java.util.function.Predicate;

public class TransactionPredicate {
    public static Predicate<Transactions> transactionsGroceryCategoryPredicate = transaction -> transaction.getType().equalsIgnoreCase("grocery");
}
