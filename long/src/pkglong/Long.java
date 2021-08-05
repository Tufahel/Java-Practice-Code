//here is a program that
//computes the number of miles that light will travel in a specified number of days:
package pkglong;

public class Long {

    public static void main(String[] args) {
      int lightspeed;
      long days;
      long seconds;
      long distance;
      
      lightspeed=186000;
      days=1000;
      seconds=days*24*60*60;
      distance=lightspeed*seconds;
      //[s=vt]
      System.out.print("In "+days);
      System.out.print(" days light will travel about "+distance);
      System.out.println(" miles");
    }
    
}
