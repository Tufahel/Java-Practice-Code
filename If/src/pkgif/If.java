/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif;

/**
 *
 * @author DELL
 */
public class If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=10;
        int y=20;
        if(x<y)
            System.out.println("x is smaller than y");
        x=x*2;
        if(x==y)
            System.out.println("x is equal to y");
        x=x*2;
        if(x>y)
            System.out.println("x is greater than y");
    }
    
}
