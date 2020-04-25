package methodclassdeep;
class Box{
    double length;
    double width;
    double height;

    //constructor when no parameter is provided
     Box(){
        width= -1;
        length= -1;
        height= -1;
    }

    //constructor when cube is created
    Box(double c){
        width=length=height=c;
    }
    //constructor when dimensions are entered
    Box (double length, double width, double height){
        this.length= length;
        this.width= width;
        this.height= height;
    }
    public void volume(){
        System.out.println(length*width*height);
    }

}
public class MethodOverloadingExample {
    public static void main(String[] args) {
        Box mybox1= new Box();
        Box mybox2= new Box (5);
        Box mybox3= new Box (4,5,6);
        mybox1.volume();
        mybox2.volume();
        mybox3.volume();
    }

}
