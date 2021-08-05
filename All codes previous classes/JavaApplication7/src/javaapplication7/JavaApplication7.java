package javaapplication7;
import java.util.Scanner;
public class JavaApplication7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        String s;

        for (int i = 1; i < 20; i++) {
            System.out.println(i);
            System.out.print("Human: ");
            float b=sc.nextInt();
            String s = sc.nextLine();
            s = s.toLowerCase();
            if (s.equals("hello")) {
                System.out.println("Robot: Hi");
            } else if (s.equals("how are you?")) {
                System.out.println("Robot: I am fine!");
            } else if (s.equals("what is your name?")) {
                System.out.println("Robot: My name is Ribo.");
            } else if (s.equals("what are you doing?")) {
                System.out.println("Robot: I am Calculating a Calculas Math.");
            } else if (s.equals("what do you know beside calculas?")) {
                System.out.println("Robot: I know Matrix also.");
            } else if (s.equals("do you know about bangladesh?")) {
                System.out.println("Robot: Yes, I know many things about Bangladesh.");
            } else if (s.equals("when bangladesh had got independence?")) {
                System.out.println("Robot: In 1971.");
            } else if (s.equals("how many bangladeshi people was died then?")) {
                System.out.println("Robot: About 3 Million.");
            } else if (s.equals("what is the capital of bangladesh?")) {
                System.out.println("Robot: The capital of Bangladesh is Dhaka.");
            } else if (s.equals("how many districts are there in bangladesh?")) {
                System.out.println("Robot: There are 64 districts in Bangladesh.");
            } else if (s.equals("what is your favourite programming language?")) {
                System.out.println("Robot: My Favourite Programming Language is C++.");
            } else if (s.equals("do you eat food?")) {
                System.out.println("Robot: No, I don't eat Food.");
            } else if (s.equals("what is your favourite game?")) {
                System.out.println("Robot: My favourite game is Cricket.");
            } else if (s.equals("bye")) {
                System.out.println("Robot: Bye....");
                break;
            }

        }
    }

}
