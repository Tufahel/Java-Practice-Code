package javaapplication9;

import java.util.Scanner;

public class JavaApplication9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            //System.out.println("Value= "+ar[5]);
            System.out.println("Enter a value: ");
            int a = sc.nextInt();
            System.out.println("Enter another value: ");
            int b = sc.nextInt();
            int c = a + b;
            System.out.println("Total Value: " + c);

        } catch (Exception e) {
            System.out.println("There is an Error.");
        }
    }

}
