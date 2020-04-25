package classprograms;

class Box{
    double width;
    double height;
    double depth;
}
public class ClassBoxDemo {
    public static void main(String[] args) {
        Box mybox= new Box();
        double vol;

        //assign values to mybox's instance variables

        mybox.width= 10;
        mybox.height= 4;
        mybox.depth= 45;

        vol= mybox.width* mybox.height* mybox.depth;
        System.out.println("Volume is:" + vol);
    }
}
