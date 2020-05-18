package methodclassdeep;

/*Let's start with a few definitions first.

When a class is defined within another class, such class is known as nested class.

A nested class has access to the members, including private members, of the class in which it is nested. However, the
enclosing class doesn't have access to the members of the nested class.

The most importatnt type of nested class is the inner class. An inner class is a non-static nested class.

 */

class Outer{
    int outer_x=100;

    void test(){
        Inner inner = new Inner();
        inner.display();
    }

    class Inner{
        void display(){
            System.out.println("display: outer_x= " + outer_x);
        }
    }
}

public class NestedClassInnerClass {
    public static void main(String[] args) {
        Outer outer= new Outer();// It is important to realize that an instance of Inner can be created
        // only in the context of the class Outer.
        outer.test();
    }
}
