//Demonstrate the lifetime of a variable.

package page107;

public class Page107 {


    public static void main(String[] args) {
        int x;
        for(x=0; x<3; x++)
        {
            int y=-1;
            System.out.println("Y is: "+y);
            y=100;
            System.out.println("Y is now: "+y);
        }
    }
    
}
