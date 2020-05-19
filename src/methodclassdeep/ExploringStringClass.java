package methodclassdeep;

public class ExploringStringClass {

    // concatinating string

    public static void main(String[] args) {
        String myString= "This is a string";
        System.out.println(myString);
        String strobj1= "First string";
        String strobj2= "Second string";
        String strobj3= strobj1+ " and " + strobj2;
        String strobj4= strobj3;
        System.out.println(strobj3);
        boolean ob= strobj3.equals(strobj4);
        //string class methods

        System.out.println("Length of string 1: " + strobj1.length());
        System.out.println("The character at 5th position is: "+ strobj1.charAt(4));
        System.out.println("Is strobj3 = stobj4? The answer is: "+ ob);
    }
}
