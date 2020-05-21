package methodclassdeep;

public class VarargsWithNormalParameter {

    //Here, msg is a normal parameter and v is a varargs parameter

    static void vaTesting(String msg, int ... v){
        System.out.print(msg + v.length+ " Contents: ");

        for (int x: v){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTesting("Dipesh ", 1,2,3);
        vaTesting("ramu ", 1,2);
        vaTesting("Kikesh ");
    }
}
