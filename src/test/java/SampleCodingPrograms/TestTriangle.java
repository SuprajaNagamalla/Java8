package SampleCodingPrograms;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter no of lines");
            int number = scanner.nextInt();

            if (number != 0) {
                for (int j = 0; j < number; j++) {
                    for (int i = 0; i <= j; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }

            }

            System.out.println("reverse Triangle");
            //int i = number;
            if (number != 0) {
                for (int j = number; j>0; j--) {
                    for (int i = 0 ;i < j; i++) {
                        System.out.print("*");
                    }
                    //i=number-1;
                    System.out.println("");
                }

            }

            System.out.println("Pyramid Pattern");
            //int i = number;
            int y;
            if (number != 0) {
                //for rows
                for (int x = 0; x < number; x++) {
                    //for space
                    for (y= number-x ;y > 1; y--) {
                        System.out.print(" ");
                    }
                    //to print *
                    for ( y = 0 ;y <= x; y++) {
                        System.out.print("* ");
                    }
                    //for line space
                    System.out.println("");
                }

            }

        } catch (InputMismatchException ime) {
            System.out.println("Enter integer numbers only like: 5 , 8, 10 ");
        }


            String str1 = "Track";
            String str2 = "Mind";

            String result = str1.concat(str2);
            System.out.println("st1 concat::"+str1);
            System.out.println("st1 concat result::"+result);

    }
}
