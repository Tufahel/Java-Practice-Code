package javaapplication2;

public class JavaApplication2 {

    public static void main(String[] args) {
        Computer c = new Computer();
        c.On();
        c.Off();
    }

}

class Computer {

    private int fan = 4;
    private int cpu = 2;

    public void On() {
        StartFan();
        beep();
        System.out.println("Computer is started.");

    }

    public void Off() {
        StopFan();
        System.out.println("Computer is Shutting down.");
    }

    private void StartFan() {
        System.out.println("Fan is Starting.");
    }

    private void StopFan() {
        System.out.println("Fan is stopping.");
    }

    private void beep() {
        System.out.println("Beep.....Beep.....Beep.....");
    }
}
