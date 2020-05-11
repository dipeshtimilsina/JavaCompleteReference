package methodclassdeep;

class Yahoo {
    int a;

    Yahoo(int a) {
        this.a = a;
    }

    Yahoo incByTen() {
        Yahoo addUp = new Yahoo(a + 10);
        return addUp;
    }
}
public class ReturningObjects{
    public static void main(String[] args) {
        Yahoo ob1= new Yahoo(5);
        Yahoo ob2;
        ob2= ob1.incByTen();
        System.out.println("ob1 is: "+ ob1.a);
        System.out.println("ob2 is: "+ ob2.a);

        ob2= ob2.incByTen();
        System.out.println("ob2 after using the method: "+ ob2.a);
    }
}