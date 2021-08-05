
package parameterizedmethod;


public class ParameterizedMethod {


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
    
    void setDim(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
}


class BoxDemo{
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        
        //assign values to mybox1's instance variables
        mybox1.setDim(10,20,15);
        mybox2.setDim(3,6,9);
        
        //assign diffrent values to mybox2's instance variables
 
        
        vol=mybox1.volume();
        System.out.println("Volume is "+vol);
        
        vol=mybox2.volume();
        System.out.println("Volume is "+vol);
        
    }
    
}