package classprograms;
class WeirdBox{
    double height;
    double length;
    double width;

    public double volume(){
        double volume= height*length*width;
        return volume;
    }
    public void setDim(double height, double length, double width){
        this.height= height;
        this.length= length;
        this.width= width;
    }
}
public class WeirdClassProgram {
    public static void main(String[] args) {
        WeirdBox box1= new WeirdBox();
        box1.setDim(5,4,2);
        double volume= box1.volume();
        System.out.println(volume);
        WeirdBox box2= new WeirdBox();
        box2.setDim(10,10,2);
        double vol2= box2.volume();
        System.out.println(vol2);
    }
}
