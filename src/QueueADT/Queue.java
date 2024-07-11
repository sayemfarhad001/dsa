package QueueADT;

public class Queue {
    int queue[] = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data){
        if(!isFull()) {          //verify if not full then enqueue
            queue[rear] = data;
            rear = (rear + 1) % 5;       //TO ACHIEVE CIRCULAR ARRAY
            size++;
        } else {
            System.out.println("Cannot add - Queue is full");
            System.out.println("##########################");
        }
    }

    public int deQueue(){
        int data = queue[front];

        if(!isEmpty()) {          //verify if not empty then dequeue
            front = (front + 1) % 5;                    //TO ACHIEVE CIRCULAR ARRAY
            size--;
        } else {
            System.out.println("Cannot remove - Queue is empty");
            System.out.println("###############################");
        }

        return data;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return getSize()==0;
    }

    public boolean isFull(){
        return getSize()==5;
    }

    public void show(){
        System.out.print("Elements : ");
        for(int i=0; i<size; i++){
            System.out.print(queue[(front + i) % 5] + " ");
                                    //front + i - in case of dequeue first index is not 0 anymore
                                    //(front+1) % 5 - will give printing error as it is a circular array

        }
        System.out.println();
        System.out.print("Actual Queue : ");
        for(int n : queue){
            System.out.print(n + " ");
        }
        System.out.println();
    }

}
