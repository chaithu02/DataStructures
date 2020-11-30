import java.util.*;

class Node
{
  Node left,right;
  int data;

  Node(int data)
  {
   left=null;
   right=null;
   this.data=data;
  }
}

class BSTEx
{

  public static Node insert(Node root,int data)
  {
    if(root==null)
    {
       return new Node(data);
    }
    else
    {
      Node cur;
      if(data<=root.data)
      {
         cur=insert(root.left,data);
         root.left=cur;
      }
      else
      {
         cur=insert(root.right,data);
         root.right=cur;
      }
      
      return root;
    }
  }

  public static void inOrder(Node root)
  {
     if(root!=null)
     {
       inOrder(root.left);
       System.out.print(root.data+" ");
       inOrder(root.right);
     }
  }


  public static void preOrder(Node root)
  {
     if(root!=null)
     {
       System.out.print(root.data+" ");
       preOrder(root.left);
       preOrder(root.right);
     }
  }

  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the test cases:");
     int t=sc.nextInt();
     Node root=null;
     while(t-->0)
     {
        int data=sc.nextInt();
        root=insert(root,data);
     }

     inOrder(root);
     System.out.println("........");
     preOrder(root);
  }
}
