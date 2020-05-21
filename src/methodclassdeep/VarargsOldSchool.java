package methodclassdeep;
//old and outdated way to doing Varargs variable-length arguments

public class VarargsOldSchool {
    static void vaTest( int v[]){
        System.out.print("Number of args: "+ v.length+ " Contents: ");

        for (int x : v){
            System.out.print(x+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a1={ 5,6,7};
        int a2[]= {1};
        int a3[]= { };

        vaTest(a1);
        vaTest(a2);
        vaTest(a3);
    }
}





















// public class Varargs{
//    static void vaTest (int v[]){
//        System.out.print(" Number of args: " + v.length+ " Contents: ");
//        for (int x : v){
//            System.out.print(x+ " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        //notice how an array must be created to hold the arguments
//        int n1[]= {10};
//        int n2[]= {1,2,3};
//        int n3[]= { };
//
//        vaTest(n1);
//        vaTest(n2);
//        vaTest(n3);
//    }
//}
