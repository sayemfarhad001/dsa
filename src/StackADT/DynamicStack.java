package StackADT;

public class DynamicStack {     //EXAPNDABLE && SHINKABLE

    int capacity = 2;
    int stack[] = new int[capacity];           //FIXED ARRAY

    int top = 0;
    public void push(int data){

        if(size()==capacity)
            expand();
        //[ 0 | 0 | 0 | 0 | 0]
        //  0   1   2   3   4
        stack[top] = data;
        top++;          //Top is the EMPTY top spot
        //FINAL        [15 | 8 | 10 | 0 | 0]
    }
    private void expand(){
        int length = size();
        int newStack[] = new int[capacity*2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        capacity *= 2;
    }

    public void show(){
        for (int n : stack){
            System.out.print(n + " ");
        }
        System.out.println();
//        System.out.println("/////////////////////////////////////////////");
    }

    public int pop(){
        int data = 0;

        if (isEmpty()){
            System.out.println("Stack is empty");
        } else {

            //[15 | 8 | 10 | 0 | 0]
            //  0   1    2   3   4
            //               |
            top--;                         //Top pointer moves from empty index 3 to index 2
            data = stack[top];         //Assign to variable to return it
            stack[top] = 0;                //reassign index 2 to 0

            shrink();

        }
        return data;                   //data = 10
        //FINAL        [15 | 8 | 0 | 0 | 0]
        //   0   1   2   3   4
    }
    public void shrink(){
        int length = size();
        if (length <= (capacity/2)/2){
            capacity = capacity/2;
        }
        int newStack[] = new int[capacity];
        System.arraycopy(stack,0,newStack, 0, length);
        stack = newStack;
    }

    public int peek(){
        //[15 | 8 | 10 | 0 | 0]
        //  0   1    2   3   4
        //               |
        int data = stack[top-1];       //Assign to variable to return it - top-1
        return data;                   //data = 10
        //FINAL        [15 | 8 | 0 | 0 | 0]
        //   0   1   2   3   4
    }

    public int size(){
        //[15 | 8 | 10 | 0 | 0]
        //  0   1    2   3   4
        //               |
        return top;                   //top = 3
    }

    public boolean isEmpty(){
        //[15 | 8 | 10 | 0 | 0]
        //  0   1    2   3   4
        //               |
        return (top<=0) ? true : false;
    }
}
