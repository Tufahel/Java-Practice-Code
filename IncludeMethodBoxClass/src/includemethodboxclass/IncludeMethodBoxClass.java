
package includemethodboxclass;


public class IncludeMethodBoxClass {


    public static void main(String[] args) {
        
    }
    
}

class Box {
    double width;
    double height;
    double depth;
    void volume(){
        System.out.print("Volume is ");
        System.out.println(width*height*depth);
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
        
        mybox1.volume();
        mybox2.volume();
        
    }
    
}