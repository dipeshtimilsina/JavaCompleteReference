package methodclassdeep;

class RecursionCode{
    int fact (int n){
        int result;
        if (n==1)
            return 1;
        else {
            result = fact(n - 1) * n;
            return result;
        }
    }
}
public class Recursion {
    public static void main(String[] args) {
        RecursionCode test1= new RecursionCode();
        System.out.println("The fact of 3 is: "+ test1.fact(3));
        System.out.println("The fact of 5 is: "+ test1.fact(5));
        System.out.println("The fact of 7 is: "+ test1.fact(7));

    }
}
