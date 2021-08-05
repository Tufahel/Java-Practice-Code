/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author DELL
 */
public class P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computer c = new Computer();
        c.On();
        c.Off();
    }
    
}
class Computer{
    private int fan=4;
    private int cpu=2;
    public void On(){
        StartFan();
        beep();
        System.out.println("PC is starting.");
    }
    public void Off(){
        StopFan();
        System.out.println("PC is shutting down.");
    }
    private void StartFan(){
        System.out.println("Fan is starting.");
    }
    private void StopFan(){
        System.out.println("Fan is stoping.");
    }
    private void beep(){
        System.out.println("Beep...Beep....Beep");
    }
}
