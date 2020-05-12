package methodclassdeep;

class Stack{
        //both stck and tos are private
        private int stck[]= new int[10];
        private int tos;

        //initialize top of stack
        Stack(){
            tos= -1;
        }

        //Push an item onto the stack
        void push (int item){
            if (tos==9){
                System.out.println("Stack is full");
            }
            else
                stck[++tos]= item;
        }

        //Pop an item from the stack
        int pop(){
            if (tos<0){
                System.out.println("Stack underflow.");
                return 0;
            }
            else
                return stck[tos--];
        }
    }

public class StackAccessControl {
    public static void main(String[] args) {
        Stack mystack1= new Stack();
        Stack mystack2= new Stack();

        //push some numbers into the stack
        for (int i=0; i<10;i++) mystack1.push(i);
        for (int i=10;i<20;i++) mystack2.push(i);

        //pop some numbers into the stack
        System.out.println("Stack in mystack1: ");
        for (int i=0; i<10;i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Stack in mystack2: ");

        for (int i=0;i<10;i++) {
            System.out.println(mystack2.pop());
        }
    }
}