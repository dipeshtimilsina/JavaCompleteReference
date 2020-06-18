package Inheritance;

class Yum{
    int a,b;

    Yum(int i, int j){
        a=i;
        b=j;
    }
    void show(){
        System.out.println("Value of a and b are "+ a+" "+  b);
    }
}
class Ryam extends Yum{
    int k;
    Ryam (int i, int j, int c){
        super(i,j);
        k=c;
    }

    void show(){
        System.out.println("k: "+ k);
    }
}
public class MethodOverriding1 {
    public static void main(String[] args) {
        Ryam a= new Ryam(3,5, 9);
        a.show();
    }
}
