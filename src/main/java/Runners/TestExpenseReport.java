package Runners;

import java.lang.reflect.Array;

public class TestExpenseReport {
    public static void main(String arg[]) {
        String expenseData[] = new String[]{"-34.45", "3.45", "-$4.45", "$56.00"};
        System.out.println(expenseReport(expenseData));
    }

    static String expenseReport(String[] data) {
        int expenseCount = 0;
        double expenseSum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i].charAt(1) == '$' && data[i].charAt(0) == '-') {
                expenseCount++;
                data[i] = data[i].replace("$", "");
                System.out.println("$ value string::" + data[i]);
                expenseSum += Double.parseDouble(data[i]);
            } else if (data[i].charAt(0) == '-') {
                expenseCount++;
                System.out.println("non $ value string::" + data[i]);
                expenseSum += Double.parseDouble(data[i]);
            }
        }
        return "expenseCount::" + expenseCount + " ::expenseSum::" + expenseSum;
    }
}
