package Inheritance;
//Using run-time polymorphism

class Figure{
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1= a;
        dim2= b;
    }

    double area(){
        System.out.println("The area of this figure is undefined");
        return 0;
    }
}

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside area of rectangle");
        return dim1*dim2;
    }
}

class Triangle extends Figure{
    Triangle (double a, double b){
        super (a,b);
    }
    double area(){
        System.out.println("Inside Area of a Triangle");
        return (dim1*dim2/2);
    }
}

public class ApplyingMethodOverriding {
    public static void main(String[] args) {
        Figure f= new Figure(10,10);
        Rectangle r= new Rectangle(9,5);
        Triangle t= new Triangle(10,8);

        //NOW, this is the important bit ~SO PAY ATTENTION~
        Figure fig;
        fig= r;
        System.out.println("Area= "+ fig.area());

        fig= t;
        System.out.println("Area = "+ fig.area());

        fig = f;
        System.out.println("Area = "+ fig.area());
    }
}
