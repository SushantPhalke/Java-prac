public class Trees {
}
class Node{
    int key;
    Node left,right;

    public Node(int item){
        int key = item ;
        left = right = null ;

    }
}
class BinaryTree {
    Node root;
    BinaryTree(int key) {root = new Node(key);}
    BinaryTree(){root = null;}
    

}