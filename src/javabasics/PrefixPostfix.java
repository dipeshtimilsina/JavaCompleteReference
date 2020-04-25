package javabasics;

class Calculate{
    int a= 10;
    public void prefix(){
        ++a;
        System.out.println(a);
    }
    public void postfix(){
        a++;
        System.out.println(a);
    }
    public void mattersPreFix(){
        System.out.println(++a);
    }
    public void mattersPostFix(){
        System.out.println(a++);
    }

}
public class PrefixPostfix {
    public static void main(String[] args) {
        Calculate test= new Calculate();
        test.mattersPreFix();
        test.mattersPostFix();
        test.mattersPostFix();
        test.prefix();
        test.postfix();
    }
}
