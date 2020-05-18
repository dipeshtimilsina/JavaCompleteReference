//Define an inner class within a for loop

package methodclassdeep;

class Outere{
    int outer_x= 100;

    void test(){
        for (int i=0;i<10;i++){
            class Inner{
                void display(){
                    System.out.println("display: outer_x= " + outer_x);
                }
            }

            Inner inner= new Inner();
            inner.display();
        }
    }
}

public class InnerClassInsideForLoop {
    public static void main(String[] args) {
        Outere outer= new Outere();
        outer.test();
    }
}
