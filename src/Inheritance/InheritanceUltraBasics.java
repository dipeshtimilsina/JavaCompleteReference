package Inheritance;

class A{
    int i, j;

    void showij(){
        System.out.println(" i and j: "+ i + " " + j);
    }
}

//create a subclass extending class A

class B extends A{
    int k;

    void showk(){
        System.out.println("k: " + k);
    }

    void sum(){
        System.out.println("i+j+k: "+ (i+j+k));
    }
}

public class InheritanceUltraBasics {
    public static void main(String[] args) {
        A superOb= new A();
        B subOb= new B();

        //The superclass my be used by itself

        superOb.i = 10;
        superOb.j= 20;
        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println();

        /* The subclass has access to all the superclass elements and its own elements */

        subOb.i= 5;
        subOb.j= 10;
        subOb.k= 15;
        System.out.println("The elements of sub are ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("The sum of the three are");
        subOb.sum();

    }
}
