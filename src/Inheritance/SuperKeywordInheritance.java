//super keyword has two feneral forms: The first calls the superclass constructor.
//The second one is used to access a member of the superclass that has been hidden
// by a member of a subclass.

package Inheritance;

class Boxx {
    double height;
    double width;
    double length;

    //construct clone of an object
    Boxx(Boxx ob) {
        height = ob.height;
        length = ob.length;
        width = ob.width;
    }

    //constructor when all dimensions are specified
    Boxx(double h, double w, double l) {
        height = h;
        width = w;
        length = l;
    }

    //when the box is a cube
    Boxx(int c) {
        height = width = length = c;
    }

    //when the box is uninitialized
    Boxx() {
        height = -1;
        width = -1;
        length = -1;
    }

    double volume() {
        return width * height * length;
    }
}

class BoxWeightt extends Boxx{
    double weight;

    //constructor for BoxWeight
    BoxWeightt (double w, double h, double l, double m){
       super (w,h,l);
       weight= m;
    }
}

public class SuperKeywordInheritance {
    public static void main(String[] args) {
        BoxWeightt box1 = new BoxWeightt(5,6,7,8);
        BoxWeightt box2= new BoxWeightt(2,5,6,8);
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
