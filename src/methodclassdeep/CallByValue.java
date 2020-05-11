package methodclassdeep;

class Tester{

    void meth(int i, int j){
        i= i/2;
        j= j*2;
    }
}


public class CallByValue {
    public static void main(String[] args) {
        Tester t1= new Tester();
        int a= 10;
        int b=30;
        System.out.println("Value before calling the object= "+ a + " and "+ b);

        t1.meth(a,b);
        System.out.println("Value before calling the object= "+ a + " and "+ b);

        //in conclusion, in call by value, there is no actual change in the value of variable even after the method call
        //in contrast, see the example of call by reference to see the difference
    }
}
