//package methodclassdeep;
////varargs, overloading and ambiguity
//
////this program will not compile and throw out an error
//
//public class VarargsAmbiguity {
//
//    static void vaTest (int ... v){
//        System.out.print("vaTest(int ...): "+ "Number of args: "+ v.length+ "Contents: ");
//
//        for (int x : v){
//            System.out.print(x+ " ");
//        }
//        System.out.println();
//    }
//
//    static void vaTest (boolean ... v){
//        System.out.print("vaTest(int ...): "+ "Number of args: "+ v.length+ "Contents: ");
//
//        for (boolean x : v){
//            System.out.print(x+ " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        vaTest(1,2,3);
//        vaTest(true, false);
//        vaTest(); //this is ambiguous method call and hence causes error
//    }
//
//
//
//}
