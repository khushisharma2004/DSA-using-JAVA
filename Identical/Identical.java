class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class Identical {

    public static boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && 
               isSameTree(p.right, q.right);
    }

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

        // Dusra tree bana lo compare karne ke liye
        Node a2 = new Node(3);
        a2.left = new Node(4);
        a2.right = new Node(2);

        System.out.println(isSameTree(a, a2));
    }
}