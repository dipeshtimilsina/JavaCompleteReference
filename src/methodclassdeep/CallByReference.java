package methodclassdeep;

import org.w3c.dom.ls.LSOutput;

class Testee{
    int a;
    int b;

    Testee(int i, int j){
        a= i;
        b= j;
    }
    void methe( Testee ob){
        ob.a*= 2;
        ob.b/= 2;
    }
}

public class CallByReference {
    public static void main(String[] args) {
        Testee t1= new Testee(10,40);
        System.out.println("Value before calling the object= "+ t1.a + " and "+ t1.b);

        t1.methe(t1);

        System.out.println("Value AFTER calling the object= "+ t1.a + " and "+ t1.b);

    }

}
