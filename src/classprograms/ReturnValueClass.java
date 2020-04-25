package classprograms;

class Boxxx {
    double height;
    double width;
    double length;

    public double volume(){
        double volume= height*width*length;
        return volume;
    }
}
public class ReturnValueClass {
    public static void main (String[] args){
    Boxxx box1= new Boxxx ();
    box1.height= 3;
    box1.width= 5;
    box1.length=10;
    double volume= box1.volume();
    System.out.println(volume);
    }
}

