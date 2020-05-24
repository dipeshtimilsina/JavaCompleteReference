package Inheritance;

class Box {
    double height;
    double width;
    int length;

    //construct clone of an object
    Box(Box ob) {
        height = ob.height;
        length = ob.length;
        width = ob.width;
    }

    //constructor when all dimensions are specified
    Box(int h, int w, int l) {
        height = h;
        width = w;
        length = l;
    }

    //when the box is a cube
    Box(int c) {
        height = width = length = c;
    }

    //when the box is uninitialized
    Box() {
        height = -1;
        width = -1;
        length = -1;
    }

    double volume() {
        return width * height * length;
    }
}

class BoxWeight extends Box{
    double weight;

    //constructor for BoxWeight
    BoxWeight (double w, double h, double l, double m){
        width= w;
        height= h;
        length= (int)l;
        weight= m;
    }
}

public class InheritancePracticalProgram {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(5,6,7,8);
        BoxWeight box2= new BoxWeight(2,5,6,8);
        double vol;

        vol= box1.volume();
        System.out.println("The volume of box1 is "+ vol);
        System.out.println("The weight of box 1 is "+ box1.weight);

        vol= box2.volume();
        System.out.println("The volume of box2 is "+ vol);
        System.out.println("The weight of box 2 is "+ box2.weight);


        Box box3= new Box(5);
        vol= box3.volume();
        System.out.println("The volume of box 3 is "+ vol);
    }

}
