package C;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class bst {
    Node root;


void lvlorder()