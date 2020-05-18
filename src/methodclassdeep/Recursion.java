package methodclassdeep;
class RecursionCode{
    int recursion (int n){
        int result;
        if (n==1){
            return 1;
        }
        else {
            result = recursion(n - 1) * n;
            return result;
        }
    }
}
public class Recursion {
    public static void main(String[] args) {
        RecursionCode num1 = new RecursionCode();
        RecursionCode num2 = new RecursionCode();
        int a = num1.recursion(5);
        int b = num2.recursion(10);
        System.out.println("The factorial of a is " + a);
        System.out.println("The factorial of b is " + b);
        System.out.println("The factorial is: "+ num1.recursion(4));
    }
}
//package methodclassdeep;
//
//class RecursionCode{
//    int fact (int n){
//        int result;
//        if (n==1)
//            return 1;
//        else {
//            result = fact(n - 1) * n;
//            return result;
//        }
//    }
//}
//public class Recursion {
//    public static void main(String[] args) {
//        RecursionCode test1= new RecursionCode();
//        System.out.println("The fact of 3 is: "+ test1.fact(3));
//        System.out.println("The fact of 5 is: "+ test1.fact(5));
//        System.out.println("The fact of 7 is: "+ test1.fact(7));
//
//    }
//}
//
