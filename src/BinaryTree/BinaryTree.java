package BinaryTree;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
        this .data = data;
    }
}

public class BinaryTree {

    Node root;

    public void insert(int data){

        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data){
//        [8,7,12,15,2,5]

        if(root==null) {
            root = new Node(data);                      //[8]
        } else if (data < root.data){
            //ADDRECURSION
            root.left = insertRec(root.left, data);     //[8,7]
        } else if (data > root.data){
            //ADDRECURSION
            root.right = insertRec(root.right, data);     //[8,12]
        }

        return root;
    }

    /////////////////////////////////////////////////////
    //CODE FOR PRINT ONLY
    //    Tree traversal - inOrder, Preorder, postorder
    public void inOrder(){
        System.out.println("InOrder Traversal : ");
        inOrderRec(root);
        System.out.println();
        System.out.println("///////////////////////////////////");
    }

    public void inOrderRec(Node root){

        if (root!=null){
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }
    /////////////////////////////////////////////////////
    public void preOrder(){
        System.out.println("PreOrder Traversal : ");
        preOrderRec(root);
        System.out.println();
        System.out.println("///////////////////////////////////");
    }

    public void preOrderRec(Node root){

        if (root!=null){
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    /////////////////////////////////////////////////////
    public void postOrder(){
        System.out.println("PostOrder Traversal : ");
        postOrderrRec(root);
        System.out.println();
        System.out.println("///////////////////////////////////");
    }

    public void postOrderrRec(Node root){

        if (root!=null){
            postOrderrRec(root.left);
            postOrderrRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    /////////////////////////////////////////////////////
}
