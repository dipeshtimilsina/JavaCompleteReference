//package methodclassdeep;
////It is both correct and common to use object as parameter in a program

package methodclassdeep;
class Test{
    int a,b;
    Test (int a, int b){
        this.a=a;
        this.b=b;
    }

    boolean isEqual(Test ob){
        if(ob.a== a && ob.b==b){
            return true;
        }
        else
            return false;
    }
}

public class ObjectAsParameter {
    public static void main(String[] args) {
        Test t1 = new Test(4, 5);
        Test t2= new Test (3,5);
        Test t3= new Test (4,5);
        System.out.println("t1=t2 >> "+ t1.isEqual(t2) );
        System.out.println("t1=t3 >> "+ t1.isEqual(t3));
    }
}