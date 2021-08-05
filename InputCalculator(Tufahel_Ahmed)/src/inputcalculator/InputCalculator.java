package inputcalculator;

import java.util.Scanner;
import java.lang.Math;

public class InputCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Note: User Manual -->>");
        System.out.println("1.This Calculator do only a few operations, they are: ");
        System.out.print("Addition, Substraction, Multiplication, Division, Power, Root and Percentage.");
        System.out.println("\n2.To use Power, use '^' Key.\n3.For Root, use '!' Key");
        System.out.println("4.If you want to Exit use Full-Stop --> '.'\n");
        System.out.println("Now Enter A Number:");
        double num = sc.nextDouble();
        System.out.println("Enter The Operator:");
        String ch = sc.nextLine();
        String st = sc.nextLine();
        double sum = num;
        int k = 0;
        int p = 0;
        while (true) {
            k++;
            int s = 0;

            //Exit
            if (st.equals(".")) {
                System.out.println("Exit.");
                break;
            }

            //Operations
            else if (st.equals("+")) {
                System.out.println("Enter A New Number:");
                num = sc.nextDouble();
                sum = sum + num;
            } else if (st.equals("-")) {
                System.out.println("Enter A New Number:");
                num = sc.nextDouble();
                sum = sum - num;
            } else if (st.equals("*")) {
                System.out.println("Enter A New Number:");
                num = sc.nextDouble();
                sum = sum * num;
            } else if (st.equals("/")) {
                System.out.println("Enter A New Number:");
                num = sc.nextDouble();
                
                    sum = sum / num;
                
            } else if (st.equals("^")) {
                System.out.println("Enter The Power:");
                num = sc.nextDouble();
                sum = Math.pow(sum, num);
            } else if (st.equals("!")) {
                sum = Math.sqrt(sum);
            } else if (st.equals("%")) {
                sum = sum/100;
            } else{
                s=1;
                System.out.println("Enter the Operator carefully PLEASE.......");
            }

            if (p == 0) {
                System.out.println("\nResult is: " + sum);
            } else if (p == 1) {
                System.out.println("\nMath Error.....\nExit.");
                break;
            }
            System.out.println();

            //Operator(+,-,*,/,^,!,%)
            System.out.println("Enter A New Operator:");
            if(s==0)
                ch = sc.nextLine();
            st = sc.nextLine();
        }

    }
}
