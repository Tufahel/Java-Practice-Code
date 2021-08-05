
package returnbox;


public class ReturnBox {

    public static void main(String[] args) {
        
    }
    
}
class Box {
    double width;
    double height;
    double depth;
    double volume(){
        return width*height*depth;
    }
}


class BoxDemo{
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        
        //assign values to mybox1's instance variables
        mybox1.width=10;
        mybox1.height=20;
        mybox1.depth=15;
        
        //assign diffrent values to mybox2's instance variables
        mybox2.width=3;
        mybox2.height=6;
        mybox2.depth=9;
        
        vol=mybox1.volume();
        System.out.println("Volume is "+vol);
        
        vol=mybox2.volume();
        System.out.println("Volume is "+vol);
        
    }
    
}