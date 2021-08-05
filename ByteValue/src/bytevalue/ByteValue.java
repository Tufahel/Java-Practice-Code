
package bytevalue;


public class ByteValue {


    public static void main(String[] args) {
        byte a=64,b;
        int i;
        i=a<<2;//Means a*2*2(left shift)
        //i=a>>2 //Means (a/2)/2(right shift)
        b=(byte)(a<<2); 
        
        System.out.println("Original value of a: "+a);
        System.out.println("i and b: "+i+" "+b);
    }
    
}
