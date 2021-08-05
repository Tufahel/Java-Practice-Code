package javaapplication6;

public class JavaApplication6 {

    public static void main(String[] args) {

        Cat c = new Cat();
        Dog d = new Dog();
        c.leg = 4;
        c.colour = "White";
        c.info();
        c.bark();
        c.jump();
        System.out.println("");
        d.leg = 4;
        d.colour = "Black";
        d.info();
        d.bark();
        d.run();
    }

}

class Animal {

    int leg;
    String colour;

    public void info() {
        System.out.println("Leg: " + leg);
        System.out.println("Colour: " + colour);
    }
}

class Cat extends Animal {

//    public void info(){
//        System.out.println("Leg: "+leg);
//        System.out.println("Colour: "+colour);
//    }
    public void bark() {
        System.out.println("Meao...");
    }

    public void jump() {
        System.out.println("I Love Jumping.");
    }
}

class Dog extends Animal {

//    public void info(){
//        System.out.println("Leg: "+leg);
//        System.out.println("Colour: "+colour);
//    }
    public void bark() {
        System.out.println("Gheo Gheo...");
    }

    public void run() {
        System.out.println("I Love Running.");
    }
}
