package methodclassdeep;

class StaticExample{
    static int a=40;
    static int b=59;

    static void callMe(){
        System.out.println("The value of a is "+ a);
    }
}
public class StaticExample2 {
    public static void main(String[] args) {
        StaticExample.callMe();
        System.out.println("The value of b is "+ StaticExample.b);
    }
}
