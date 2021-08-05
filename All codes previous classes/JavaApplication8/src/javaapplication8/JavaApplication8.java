package javaapplication8;

public class JavaApplication8 {

    public static void main(String[] args) {
        Season se = new Season();
        Man m = new Man();
    }

}

class Season {

    public Season() {
        System.out.println("There are different seasons in different country");
    }

    public Season(int c) {
        System.out.println("There are 6 seasons in Bangladesh");
        fiSeason();
    }

    public void fiSeason() {
        System.out.println("The first season of them is Summer");
    }
}

class Man {

    public Man() {
        System.out.println("Every person has their unique mentality.");
    }

    public Man(int b) {
        System.out.println("Men are independent in their works.");
    }
}
