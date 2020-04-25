package classprograms;

//This class defines a stack that can hold 10 values

class Stack{
    int stck[]= new int[10];
    int tos; //top of stack

    //Initialize the top-of stack
    Stack(){
        tos=-1;
    }

    //Push an item into the stack
    void push (int item){
        if (tos==9){
            System.out.println("Stack Full");
        }
        else{
            stck[++tos]= item;
        }
    }

    //Pop an item from the stack
    int pop(){
        if (tos<0) {
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return stck[tos--];
    }

}

public class StackClass{
    public static void main(String[] args) {
        Stack myStack1= new Stack();
        Stack myStack2= new Stack();

        //push some numbers into the stack

        for (int i=0;i<10;i++){
            myStack1.push(i);
        }
        for (int i=10; i<20;i++){
            myStack2.push(i);
        }

        //Pop these numbers off the stack

        System.out.println("Stack in my first stack1");
        for (int i=0; i<10; i++){
            System.out.println(myStack1.pop());
        }
        System.out.println();
        System.out.println("Stack in my second stack2");
        for (int i=10; i<20;i++){
            System.out.println(myStack2.pop());
        }
    }
}


