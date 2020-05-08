package methodclassdeep;
//It is both correct and common to use object as parameter in a program

class Test{
    int a,b;

    Test (int a,int b){
        this.a=a;
        this.b=b;
    }

    //return true if o is equal to invoking object
    boolean equalTo (Test o){
        if (o.a==a && o.b==b)
            return true;
        else
            return false;
    }
}
public class ObjectAsParameter {
    public static void main(String[] args) {
        Test ob1= new Test(100,22);
        Test ob2= new Test (100,22);
        Test ob3= new Test (4,5);

        System.out.println("ob1==ob2: "+ ob1.equalTo(ob2));
        System.out.println("ob1== ob3: "+ ob1.equalTo(ob3)); //back on track

    }
}
