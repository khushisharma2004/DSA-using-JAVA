
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;    }
}

public class Levels {
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
        display(a);
System.out.println();
        System.out.println("size is"+size(a));
        System.out.println("sum is"+sum(a));
        System.out.println("level is"+levels(a));


 }
 private static int levels(Node root){
  if(root==null) return 0;
  return 1+Math.max(levels(root.left),levels(root.right));
  
   
 }
 private static int size(Node root){
  if(root==null) return 0;
  int leftSize=size(root.left);
  int rightSize=size(root.right);       
  return 1+leftSize+rightSize;
  
   
 }
  private static int sum(Node root){
  if(root==null) return 0;
  return root.val+sum(root.left)+sum(root.right);
  
   
 }
  private static void display(Node root){
    
    if(root==null) return;
    System.out.print(root.val+"");
      display(root.left);   //left ki saari values prit kr dega
      
      display(root.right);   //     right ki saari values print kr dega


  }
}
    


