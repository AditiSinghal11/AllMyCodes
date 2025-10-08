public class BinaryTreeInOrder {
    // Node class for the binary tree
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Root of the Binary Tree
    Node root;

    // Insert a node into the binary tree (for simplicity, insert as a BST)
    Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // In-order traversal
    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeInOrder tree = new BinaryTreeInOrder();
        /* Build the following tree:
                  5
                /   \
               3     7
              / \   / \
             2   4 6   8
        */
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }
        System.out.print("In-order Traversal: ");
        tree.inOrder(tree.root);
        System.out.println();
    }
}
