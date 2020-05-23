package Inheritance;

class Box{
    int height;
    int width;
    int length;

    //construct clone of an object
    Box (Box ob){
        height= ob.height;
        length= ob.length;
        width= ob.width;
    }
    //constructor when all dimensions are specified
    Box (int h, int w, int l){
        height= h;
        width= w;
        length= l;
    }
    //when the box is a cube
    Box (int c){
        height=width=length=c
    }


}

public class InhertiancePracticalProgram {
}
