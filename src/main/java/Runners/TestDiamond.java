package Runners;

import java.util.Scanner;

public class TestDiamond {
    public static void main(String[] args) {
        int i, j, lines, space=1;
        char star='*';
        System.out.println("Enter number of lines to print diamond shape::");
        Scanner input = new Scanner(System.in);
        lines = input.nextInt();
        space = lines-1;
        //int lines=5;
        for(i=1;i<=lines;i++){
            for(j=1;j<=space;j++){
                System.out.print(" ");
            }
            space--;
            for(j=1;j<=2*i-1;j++){
                System.out.print(star);
            }
            System.out.println();
        }
        space=1;
        for( i=1;i<=lines-1;i++){
            for(j=1;j<=space;j++){
                System.out.print(" ");
            }
            space++;
            for(j=1;j<=2*(lines-i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
