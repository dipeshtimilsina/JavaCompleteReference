package ClassPrograms;

class Boxx{
    double height;
    double width;
    double length;

    public Boxx(double height, double width, double length){
        this.height= height;
        this.width= width;
        this.length= length;
    }

    public void printValue(){
        double volume= height*width*length;
        System.out.println("Volume ="+ volume);
    }
}
public class MethodToClassBox {
    public static void main(String[] args) {
        Boxx box1= new Boxx(1,2,3);
        box1.height=14;
        box1.width= 33;
        box1.length= 20;
        box1.printValue();

        Boxx box2= new Boxx (4,5,6);
        box2.printValue();



    }

}
