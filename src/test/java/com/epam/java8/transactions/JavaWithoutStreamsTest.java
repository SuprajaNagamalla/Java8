package com.epam.java8.transactions;

import com.epam.java8.BaseTest;
import com.epam.java8.models.Product;
import com.epam.java8.models.Transactions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class JavaWithoutStreamsTest extends BaseTest {

    @Test
    public void testGetAllGroceryTransactionsDataWithoutStreams() {
        System.out.println("without streams::"+getTransactionByCategory("grocery"));
    }

    public List<Transactions> getTransactionByCategory(String category) {

        List<Transactions> ret = new ArrayList<>();

        if(transactions.size() == 0){
            return ret;
        }

        for(Transactions t :transactions) {
            if(t.getType().equalsIgnoreCase(category))
                ret.add(t);
        }

        return ret;
    }
}
