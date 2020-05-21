package methodclassdeep;

public class VarargsImplement {
    static void varTest(int ... v){
        System.out.print(" Number of args: "+ v.length+ " Contents: ");
    for (int x: v)
        System.out.print(x + " ");

    System.out.println();
    }

    public static void main(String[] args) {
        //Notice how varTest() can be called without actually creating an array and inputing variable number of
        //arguments

        varTest(1);
        varTest(1,2,3,5);
        varTest();
    }

}
