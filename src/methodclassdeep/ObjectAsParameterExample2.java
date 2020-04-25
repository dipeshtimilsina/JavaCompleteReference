package methodclassdeep;
class Boxx{
    double length;
    double width;
    double height;

    //Notice this constructor. It takes an object of type Box
        Boxx (Boxx ob){
            width= ob.width;
            height=ob.height;
            length= ob.length;
        }
    //constructor when dimensions are entered
    Boxx (double length, double width, double height){
        this.length= length;
        this.width= width;
        this.height= height;
    }
    //constructor used when no dimensions specified
    Boxx(){
        width= -1;
        length= -1;
        height= -1;
    }

    //constructor when cube is created
    Boxx(double c){
        width=length=height=c;
    }

    public void volume(){
        System.out.println(length*width*height);
    }

}
public class ObjectAsParameterExample2 {
    public static void main(String[] args) {
        Boxx mybox1= new Boxx();
        Boxx mybox2= new Boxx (5);
        Boxx mybox3= new Boxx (4,5,6);
        Boxx clonebox= new Boxx (mybox3);
        mybox1.volume();
        mybox2.volume();
        mybox3.volume();
        clonebox.volume();
    }

}

