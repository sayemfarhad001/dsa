package LinkedList;

public class Runner {

    public static void main(String[] args) {
//INTERNAL IMPLEMENTATION
//        LinkedList list = new LinkedList();
//
//        list.add(5);
//        list.add(3,12);

//      MY IMPLEMENTATION
        LinkedList list = new LinkedList();

        System.out.println("Linked List");

        //////////////////////////////////////////////////////////////
        //Insert at End
        list.insert(18);
        list.insert(45);
        list.insert(12);
        System.out.println("Insert at End");
        list.show();        //Print

        //////////////////////////////////////////////////////////////
        //Insert at start
        list.insertAtStart(25);
        System.out.println("Insert at Start");
        list.show();        //Print

        //////////////////////////////////////////////////////////////
        //Insert at a given Index 2
        list.insertAt(2,55);        //Between 18 and 45
        System.out.println("Insert at given Index 2");
        list.show();        //Print

        //////////////////////////////////////////////////////////////
        //Delete at a given Index 2
        list.deleteAt(2);               //Between 18 and 45
        System.out.println("Delete at given Index 2");
        list.show();        //Print
    }
}
