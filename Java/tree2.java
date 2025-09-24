//write a program to create a binary tree using a linked representation and also write a function to count:
//1. total number of nodes
//2. number of leaf nodes   
//3. number of internal nodes
//using java tree implementation ,abstract classes and binary tree extending binary tree
public class tree2{}

 interface Position<T> { T getElement(); }

abstract class AbstractTree<T> {
    public abstract Position<T> root();
    public abstract Position<T> left(Position<T> p);
    public abstract Position<T> right(Position<T> p);

    public int size(Position<T> p) {
        return (p==null)?0:1+size(left(p))+size(right(p));
    }
    public int leafCount(Position<T> p) {
        return (p==null)?0:(left(p)==null&&right(p)==null)?1:leafCount(left(p))+leafCount(right(p));
    }
    public int internalCount(Position<T> p) {
        return (p==null|| (left(p)==null&&right(p)==null))?0:1+internalCount(left(p))+internalCount(right(p));
    }
}

class LinkedBinaryTree<T> extends AbstractTree<T> {
    static class Node<T> implements Position<T> {
        T e; Node<T> l,r,p;
        Node(T e, Node<T> p){this.e=e; this.p=p;}
        public T getElement(){return e;}
    }
    private Node<T> root;
    public Position<T> root(){return root;}
    public Position<T> left(Position<T> p){return ((Node<T>)p).l;}
    public Position<T> right(Position<T> p){return ((Node<T>)p).r;}

    public Position<T> addRoot(T e){root=new Node<>(e,null); return root;}
    public Position<T> addLeft(Position<T> p,T e){Node<T> n=new Node<>(e,(Node<T>)p); ((Node<T>)p).l=n; return n;}
    public Position<T> addRight(Position<T> p,T e){Node<T> n=new Node<>(e,(Node<T>)p); ((Node<T>)p).r=n; return n;}

    public static void main(String[] args){
        LinkedBinaryTree<Integer> t=new LinkedBinaryTree<>();
        Position<Integer> r=t.addRoot(1);
        t.addLeft(r,2); t.addRight(r,3);   // just 1 root + 2 children
        System.out.println("Total: "+t.size(r));
        System.out.println("Leaf: "+t.leafCount(r));
        System.out.println("Internal: "+t.internalCount(r));
    }
}
