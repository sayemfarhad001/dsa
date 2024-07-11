package BinaryTree;

//import com.sun.source.tree.BinaryTree;        //DEFAULT INBUILT BINARY TREE

//import <package.name>             //if classes are brought from different package
public class Main {
    public static void main(String[] args) {
        //DEFAULT INBUILT BINARY TREE
//        BinaryTree tree = new BinaryTree(){
//
//        }

        //CLASS CREATED BY ME
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        //PRINT ONLY WITH TRAVERSAL
        tree.inOrder();
        tree.preOrder();
        tree.postOrder();
    }
}
