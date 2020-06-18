package Inheritance;

class Yumm{
    int a,b;

    Yumm(int i, int j){
        a=i;
        b=j;
    }
    void show(){
        System.out.println("Value of a and b are "+ a+" "+  b);
    }
}
class Ryamm extends Yumm{
    int k;
    Ryamm (int i, int j, int c){
        super(i,j);
        k=c;
    }

    void show(){
        super.show();
        System.out.println("k: "+ k);
    }
}
public class MethodOverriding1Mod {
    public static void main(String[] args) {
        Ryamm a= new Ryamm(3,5, 9);
        a.show();
    }
}
