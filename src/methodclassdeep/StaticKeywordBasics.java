package methodclassdeep;
//demonstrate static variables, methods and blocks
public class StaticKeywordBasics {
    static int a = 3;
    static int b;

    static void metho(int x){
        System.out.println("x= "+x);
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }

    static{
        System.out.println("Static block initialized");
        b=a*4;
//        b=a+2;
    }

    public static void main(String[] args) {
        metho(42);
    }
}
