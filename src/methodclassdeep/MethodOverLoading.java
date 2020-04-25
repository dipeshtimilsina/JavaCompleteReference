package methodclassdeep;
class OverloadDemo{
    void test(){
        System.out.println("There are no parameters");
    }
    void test (int a){
        int b= a;
        System.out.println("This one takes parameter and the number taken is: "+ b);
    }

    void test (int a, int b){
        int c= a+b;
        System.out.println("The sum of the two input numbers: "+ c);
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        OverloadDemo test1= new OverloadDemo();
        test1.test();
        test1.test(5);
        test1.test(4,9);
    }

}
