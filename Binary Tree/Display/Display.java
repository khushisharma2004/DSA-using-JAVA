
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;    }
}

public class Display {
    public static void main (String args[]){
         Node a=new Node(3);
         Node b=new Node(4);
         Node c=new Node(2);
         Node d=new Node(-1);
         Node e=new Node(1);
         Node f=new Node(6);
        Node g=new Node(9);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
        System.out.println();
 
   
 }
  private static void preorder(Node root){
    
    if(root==null) return;
    System.out.print("preorder is"+root.val+"");
      preorder(root.left);   //left ki saari values prit kr dega
      
      preorder(root.right);   //     right ki saari values print kr dega


  }
   private static void inorder(Node root){
    
    if(root==null) return;
    
      inorder(root.left);   //left ki saari values prit kr dega
      System.out.print("inorder is"+root.val+"");
      inorder(root.right);   //     right ki saari values print kr dega


  }
   private static void postorder(Node root){
    
    if(root==null) return;
    
      postorder(root.left);   //left ki saari values prit kr dega
      
      postorder(root.right);   //     right ki saari values print kr dega
System.out.print("postorder is"+root.val+"");

  }
}


