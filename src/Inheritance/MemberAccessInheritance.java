package Inheritance;
//when a members of the superclass are private , you can't access those elements from outside the class

//create a superclass
    class Aa{
        int i;
        private int j; //

    void setij (int x, int y){
        x= i;
        y= j;
    }
}

    class Bb extends Aa{
        int total;

        void sum(){
           // total= i+j; //Error j is not accessible here
        }
    }
public class MemberAccessInheritance {
    public static void main(String[] args) {
        Bb subOb= new Bb();
        subOb.setij(1,2);

        subOb.sum();
        System.out.println("Total is "+ subOb.total);
    }
}
