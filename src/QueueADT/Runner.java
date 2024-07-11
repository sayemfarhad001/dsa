package QueueADT;

public class Runner {
    public static void main(String[] args) {
        Queue nums = new Queue();

        System.out.println("Queue - Flat to Circular Array");
        System.out.println("/////////////////////////////////////////////");

        /////////////////////////////////////////////////////////////
        System.out.println("enQueue - Add form rear of the Queue");
        nums.enQueue(5);
        nums.enQueue(2);
        nums.enQueue(7);
        nums.enQueue(3);
        nums.show();        //Print

        /////////////////////////////////////////////////////////////
        System.out.println("/////////////////////////////////////////////");
        System.out.println("deQueue - Delete from front of the Queue");
        System.out.println(nums.deQueue());
        nums.show();        //Print
        System.out.println(nums.deQueue());
        nums.show();        //Print

        /////////////////////////////////////////////////////////////
        System.out.println("/////////////////////////////////////////////");
        System.out.println("enQueue - Add form rear of the Queue after deQueue");
        nums.enQueue(9);
        nums.enQueue(1);
        nums.show();        //Print

        /////////////////////////////////////////////////////////////
        System.out.println("/////////////////////////////////////////////");
        System.out.println("Size - returns size of the Queue");
        System.out.println("size : " + nums.getSize());
        nums.show();        //Print

        /////////////////////////////////////////////////////////////
        System.out.println("/////////////////////////////////////////////");
        nums.deQueue();
        nums.deQueue();
        nums.deQueue();
        nums.deQueue();
        //###############################
        nums.deQueue();             //Cannot remove - Queue is empty
        //###############################
        System.out.println("Is Empty : " + nums.isEmpty());
        System.out.println("size : " + nums.getSize());
        nums.show();        //Print

        /////////////////////////////////////////////////////////////
        System.out.println("/////////////////////////////////////////////");
        nums.enQueue(19);
        nums.enQueue(21);
        nums.enQueue(52);
        nums.enQueue(96);
        nums.enQueue(77);
        //###############################
        nums.enQueue(500);      // Cannot add - Queue is full
        //###############################
        System.out.println("Is Full : " + nums.isFull());
        nums.show();        //Print

        System.out.println("/////////////////////////////////////////////");

    }
}
