package methodclassdeep;

class Testa{
    int a; //default access
    public int b; //public access
    private int c; //private access

    //methods to access c
    void setc(int i){
        c=i;  //set c's value
    }

    int getc() {
        return c;
    }
}
public class AccessControlBasics {
    public static void main(String[] args) {
        Testa ob= new Testa();
        //These are Ok, a and b may be accessed directly
        ob.a=10;
        ob.b=20;
        //This is not OK and will cause an error
        // ob.c= 100;
        //you must access c through its methods
        ob.setc(100); //ok
        System.out.println("The value of a,b, and c are: " + ob.a + " " + ob.b+ " "+ ob.getc());
    }
}
