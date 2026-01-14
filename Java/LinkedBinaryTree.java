// Binary Search Tree (linked representation) with common operations:
// insert, delete, findMin, findMax, countNodes, countLeafNodes, countInternalNodes
// This implementation uses a linked Node class with parent pointers and T extends Comparable<T>.

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

public class LinkedBinaryTree<T extends Comparable<T>> extends AbstractTree<T> {
    static class Node<T> implements Position<T> {
        T e; Node<T> l,r,p;
        Node(T e, Node<T> p){this.e=e; this.p=p;}
        public T getElement(){return e;}
    }

    private Node<T> root;

    @Override public Position<T> root(){return root;}
    @Override public Position<T> left(Position<T> p){return ((Node<T>)p).l;}
    @Override public Position<T> right(Position<T> p){return ((Node<T>)p).r;}

    // BST insert
    public void insert(T key) {
        Node<T> y = null;
        Node<T> x = root;
        while (x != null) {
            y = x;
            if (key.compareTo(x.e) < 0) x = x.l;
            else x = x.r;
        }
        Node<T> z = new Node<>(key, y);
        if (y == null) {
            root = z;
        } else if (key.compareTo(y.e) < 0) {
            y.l = z;
        } else {
            y.r = z;
        }
    }

    // Search helper
    private Node<T> search(Node<T> x, T key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.e);
        if (cmp == 0) return x;
        return (cmp < 0) ? search(x.l, key) : search(x.r, key);
    }

    // Transplant helper for delete
    private void transplant(Node<T> u, Node<T> v) {
        if (u.p == null) root = v;
        else if (u == u.p.l) u.p.l = v;
        else u.p.r = v;
        if (v != null) v.p = u.p;
    }

    private Node<T> minimum(Node<T> x) {
        if (x == null) return null;
        while (x.l != null) x = x.l;
        return x;
    }

    private Node<T> maximum(Node<T> x) {
        if (x == null) return null;
        while (x.r != null) x = x.r;
        return x;
    }

    // Delete key from BST; returns true if deleted
    public boolean delete(T key) {
        Node<T> z = search(root, key);
        if (z == null) return false;
        if (z.l == null) {
            transplant(z, z.r);
        } else if (z.r == null) {
            transplant(z, z.l);
        } else {
            Node<T> y = minimum(z.r);
            if (y.p != z) {
                transplant(y, y.r);
                y.r = z.r;
                if (y.r != null) y.r.p = y;
            }
            transplant(z, y);
            y.l = z.l;
            if (y.l != null) y.l.p = y;
        }
        return true;
    }

    // Find min/max values
    public T findMin() { Node<T> n = minimum(root); return n==null?null:n.e; }
    public T findMax() { Node<T> n = maximum(root); return n==null?null:n.e; }

    // Count wrappers
    public int countNodes() { return size(root()); }
    public int countLeafNodes() { return leafCount(root()); }
    public int countInternalNodes() { return internalCount(root()); }

    // In-order traversal
    public void inOrder() { inOrder(root); System.out.println(); }
    private void inOrder(Node<T> x) {
        if (x == null) return;
        inOrder(x.l);
        System.out.print(x.e + " ");
        inOrder(x.r);
    }

    // Utility to print tree details
    public void printStats() {
        System.out.println("In-order: "); inOrder();
        System.out.println("Min: " + findMin());
        System.out.println("Max: " + findMax());
        System.out.println("Total nodes: " + countNodes());
        System.out.println("Leaf nodes: " + countLeafNodes());
        System.out.println("Internal nodes: " + countInternalNodes());
    }

    // Demo
    public static void main(String[] args) {
        LinkedBinaryTree<Integer> bst = new LinkedBinaryTree<>();
        int[] vals = {50, 30, 70, 20, 40, 60, 80};
        for (int v : vals) bst.insert(v);
        System.out.println("After inserts:");
        bst.printStats();

        System.out.println("\nDelete 70 (has one child in this tree):");
        bst.delete(70);
        bst.printStats();

        System.out.println("\nDelete 30 (has two children):");
        bst.delete(30);
        bst.printStats();
    }
}
