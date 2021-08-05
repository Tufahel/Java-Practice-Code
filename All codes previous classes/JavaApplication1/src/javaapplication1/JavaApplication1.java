package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Welcome....");
        System.out.println("");
        /*int n=4;
        
        //Odd Even
        if(n%2==0)
            System.out.println("Even.");
        else
            System.out.println("Odd.");
        System.out.println("");
        //Hello world 100 times
        for(int i=0; i<100; i++)
        {
            System.out.println("Hello World!");
        }
        System.out.println("");
    
        //Factorial
        int k=1;
        for(int i=1; i<=n; i++)
        {
            k=k*i;
        }
        System.out.println("Factorial Value = "+k);
        System.out.println("");
        //Sum
        int p=0;
        for(int i=1; i<=n; i++)
        {
            p=p+i;
        }
        System.out.println("Sum Value = "+p);
        System.out.println("");*/
        Car.getName();
        Car c = new Car();
        c.ignite();
        c.goForward(3);
        c.goForward();
        System.out.println("Previous speed=" + c.speed);
        c.speed = 32;
        System.out.println("New speed=" + c.speed);
        System.out.println("");
        MyCalculator.getName1();
        MyCalculator m = new MyCalculator();
        m.add(3, 7);
        m.diff(6, 2);
        m.prod(3, 3);
        m.div(8, 4);
    }

}

class Car {

    int wheels = 4;
    int speed = 100;
    int color = 255;

    static void getName() {
        System.out.println("This is car class.");
    }

    void start() {
        System.out.println("Car is Started.");
    }

    void stop() {
        System.out.println("Car is stopped.");
    }

    void ignite() {
        System.out.println("Engine ignitted.");
    }
    void goForward(int s) {
        System.out.println("Car is going forward for " + s + " seconds");
    }
    void goForward() {
        System.out.println("Car is going forward seconds");
    }
}

class MyCalculator {

    static void getName1() {
        System.out.println("This is calculator class.");
    }

    void add(int a, int b) {
        int k = a + b;
        System.out.println("Sum is = " + k);
    }

    void diff(int c, int d) {
        int k = c - d;
        System.out.println("Abstraction is = " + k);
    }

    void prod(int e, int f) {
        int k = e * f;
        System.out.println("Multiplication is = " + k);
    }

    void div(int g, int h) {
        int k = g / h;
        System.out.println("Division is = " + k);
    }
}
