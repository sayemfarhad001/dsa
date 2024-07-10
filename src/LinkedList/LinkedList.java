package LinkedList;

public class LinkedList {
    Node head;

    public void insert(int data){   //method to add node at the end
        //Example insert(18)
        //Example insert(45)

        //Create new node with the new number to be added
        Node node = new Node();     //[-|-]    //Create new node
        node.data = data;           //[18|-]
        node.next = null;           //[18|null]     //As it is the end node

        if (head==null){            //[HEAD|null]   //if linked list is not initialized

            head = node;            //[HEAD|i18]->[18|null]

        } else {                    //[HEAD|i18]->[18|null]

            //To start Traversing set node n to head
            Node n = head;          //[HEAD|i18]    //Select the head of linkedList

            while(n.next!=null){    //Go to current last node
                n= n.next;
            }

            //Reached last node - [18|null]
            n.next = node;          //[18|i45]    //Assign n.next to newly created NODE
        }
    }

    public void deleteAt(int index){

        //[head|i25]->[25|i18]->[18|i55]->[55|i45]->[45|i12]->[12|null]

        if(index==0){           //[head|i25]  //Example deleteAt(0)

            head = head.next;   //[head|i18]

        }   else {              //[55|i45]   //Example deleteAt(2)
            //To start Traversing set node n to head
            Node n = head;

            //To reach Node at previous index than the INDEX from argument - for assigning node.next to this newly created NODE
            for(int i=0; i<index-1; i++){       //reach node at index-1
                n = n.next;
            }

            Node n1 = null;                     //[-|-]       //create a temp node n1 to collect the deleted node

            //Reached last node - [18|i55]
            n1 = n.next;                        //[55|i45]          //n = node coming from for loop

            n.next = n1.next;                   //[18|i45]


            //[head|i25]->[25|i18]->[18|i55]->[55|i45]->[45|i12]->[12|null]
            //                 (n1) [55|i45]->
            //[head|i25]->[25|i18]->[18|i45]->[45|i12]->[12|null]

            //System.out.println("n1 : " + n1.data);

            //Garbage Collection
            n1 = null;
        }
    }

    public void show(){   //method to print all values

        //To start Traversing set node n to head
        Node node = head;
        while(node.next!=null){
            //Print for node data one by one until we reach last node(where n.next == null)
            System.out.println(node.data);
            node = node.next;
        }
        //Print for last data
        System.out.println(node.data);
    }

    public void insertAtStart(int data){
        //Example insertAtStart(25)
        // [head|i0]->[Index0|addressOfIndex1]->[Index1|addressOfIndex2]->[Index2|addressOfIndex3]->[Index2|null]
        // [head|i18]->[18|i45]->[45|i12]->[12|null]

        //Create new node with the new number to be added
        Node node = new Node();     //[-|-]    //Create new node
        node.data = data;           //[25|-]
        node.next = null;           //[25|null]
        node.next = head;           //[25|addressOfCurrentHead]    //[25|i18]   //Points to current head

        head = node;                //[head|i25]->[25|i18]->[18|i45] //Now it is the new head

        //FINAL DATA                //[head|i25]->[25|i18]->[18|i45]->[45|i12]->[12|null]
    }

    public void insertAt(int index, int data){
        //Example insertAt(2,55)

        // [head|i25]->[25|i18]->[18|i45]->[45|i12]->[12|null]
        //Create new node with the new number to be added
        Node node = new Node();     //[-|-]    //Create new node
        node.data = data;           //[55|-]
        node.next = null;           //[55|null]

        //Another example insert(0,55) will not work - below condition will fix it
        if(index==0){

           insertAtStart(data);

        }   else {

            //To start Traversing set node n to head
            Node n = head;

            //To reach Node at previous index than the INDEX from argument - for assigning node.next to this newly created NODE
            for(int i=0; i<index-1; i++){       //reach node at index-1
                n = n.next;
            }

            //Reached last node - [18|i45]
            node.next = n.next;         //[55|i45]      //node = newly created node
            n.next = node;              //[18|i55]      //n = node coming from for loop
            //FINAL
            // [head|i25]->[25|i18]->[18|i55]->[55|i45]->[45|i12]->[12|null]

        }

    }
}
