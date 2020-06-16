package Inheritance;

class Boxu{
    private double width;
    private double height;
    private double depth;

    //construct clone of an object
    Boxu (Boxu ob){
        width= ob.width;
        height= ob.height;
        depth= ob.depth;
    }

    //constructor when all the dimensions are specified
    Boxu( double w, double h, double d ){
        width=w;
        height=h;
        depth=d;
    }

    //default constructor
    Boxu(){
        width=-1;
        height=-1;
        depth=-1;
    }
    //constructor when a box is a cube
    Boxu (double len){
        width=height=depth=len;
    }
    //compute and return volume
    double volume(){
        return width*height*depth;
    }
}

class BoxuWeight extends Boxu{
    double weight;

    BoxuWeight (BoxuWeight ob){ //pass object as parameter
        super(ob);
        weight= ob.weight;
    }
    BoxuWeight (double w, double h, double d, double m){
        super(w,h,d);
        weight= m;
    }

    BoxuWeight(){
        super();
        weight=-1;
    }

    //constructor used when cube is created
    BoxuWeight(double len, double m){
        super(len);
        weight=m;
    }
}

class Shipment extends BoxuWeight{
    double cost;

    //construct clone of an object
    Shipment(Shipment ob){
        super(ob);
        cost=ob.cost;
    }

    Shipment (double w, double h, double d, double m, double c){
        super (w,h,d,m);
        cost=c;
    }
    Shipment(){
        super();
        cost=-1;
    }

    Shipment(double len, double m, double c){
        super(len,m);
        cost=c;
    }
}
public class MultiLevelHierarchy {
    public static void main(String[] args) {
        Shipment shipment1= new Shipment (10,20,15,10,3.41);
        Shipment shipment2= new Shipment (2,3,4,0.76,1.28);
        double vol= shipment1.volume();
        System.out.println("Volume of shipment1 is "+ vol);
        System.out.println("Weight of shipment 1 is "+ shipment1.weight);
        System.out.println("Shipping cost: $"+ shipment1.cost);
        System.out.println();
        vol= shipment2.volume();
        System.out.println("Volume of shipment1 is "+ vol);
        System.out.println("Weight of shipment 1 is "+ shipment2.weight);
        System.out.println("Shipping cost: $"+ shipment2.cost);

    }

}
