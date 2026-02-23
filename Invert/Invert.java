class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class Invert {

    public static void main(String args[]) {

        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);

        a.left = b; 
        a.right = c;
        b.left = d; 
        b.right = e;
        c.left = f; 
        c.right = g;
        System.out.println("Before Invert (Preorder): ");
        preorder(a);

        Node result = invert(a);

       System.out.println("\nAfter Invert (Preorder): ");
        preorder(result);
    }

    public static Node invert(Node root) {
        if (root == null) return null;

        // swap
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // recursive calls
        invert(root.left);
        invert(root.right);

        return root;
    }
      public static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
}