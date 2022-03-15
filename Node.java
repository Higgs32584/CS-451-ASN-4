public class Node{
    int num;
    Node left;
    Node right;
    Node(int num){
        this.num = num;
    }
    void setLeft(Node n){
        left=n;
    }
    void setRight(Node n){
        right=n;
    }  
}
