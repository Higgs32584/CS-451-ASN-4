import java.util.ArrayList;
import java.util.Random;

class Node{
    int num;
    Node left;
    Node right;
    public Node(int num,Node left,Node right ){
        this.num = num;
        this.left = left;
        this.right = right;
    }
    void setLeft(Node n){
        left=n;
    }
    void setRight(Node n){
        right=n;
    }  
}
class BinaryTree{
    // The tree should include methods to insert integers and to print the tree inorder, preorder, and postorder. The tree need not be balanced.
    Node head;
    public BinaryTree(Node head){
        this.head = head;
    }
    public void inOrder(){
        
    }
    public void preOrder(){
        
    }
    public void postOrder(){
        
    }
}
public class test{
    public static void main(String[] args){
        Node n = new Node(0,null,null);
        BinaryTree b = new BinaryTree(n);
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0;i<10;i++){
        arr.add(rand.nextInt(100));
        }
    }
}