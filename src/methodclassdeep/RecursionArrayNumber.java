package methodclassdeep;
 class RecursionArray {
    int values[];
    RecursionArray (int i){
        values= new int[i];
    }

    //display array recursively
    void printArray (int i){
        if (i==0) return;

        else{
            printArray(i-1);
            System.out.println("["+ (i-1) + "] "+ values[i-1]);
        }
    }
}
 public class RecursionArrayNumber{
     public static void main(String[] args) {
         RecursionArray r = new RecursionArray(10);

         int i;

         for (i=0; i<10;i++){
             r.values[i]=i;

         }
         r.printArray(10);

     }
 }

