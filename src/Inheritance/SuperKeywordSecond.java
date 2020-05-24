package Inheritance;
//This is the second use of super form
//Super keyword can be used in either a method or an instance variable
class Aaa{
        int a;
}
class Bbb extends Aaa{
    int a; //this a hides the a in class Aaa

    Bbb(int i, int j){
        super.a= i; //a in Aaa
        a= j; //a in Bbb
    }

    void show (){
        System.out.println(" i in superclass: "+ super.a);
        System.out.println("i in subclass: "+ a);
    }
}

public class SuperKeywordSecond {
    public static void main(String[] args) {
        Bbb subOb= new Bbb (1,2);

        subOb.show();
    }
}
