class BinaryTree
{
   Node root;
   
   static class Node
   {
     int data;
     Node left,right;

     Node(int data)
     {
       this.data=data;
       left=null;
       right=null;
     }
   }

    BinaryTree()
    {
       root=null;
    }

    public static void InTraverse(Node node)
    {
         if(node==null)
         return;

        InTraverse(node.left);
        System.out.print(node.data+ " ");
        InTraverse(node.right);
    }


     
    public static void PreTraverse(Node node)
    {
          if(node==null)
          return;

          System.out.print(node.data + " ");
          PreTraverse(node.left);
          PreTraverse(node.right);
    }
    
    public static void PostTraverse(Node node)
    {
         if(node==null)
         return;

         PostTraverse(node.left);
         PostTraverse(node.right);
         System.out.print(node.data+ " ");
    }

   public static void main(String args[])
   {
     BinaryTree tree=new BinaryTree();

     tree.root=new Node(1);

     tree.root.left=new Node(2);
     tree.root.right=new Node(3);
     tree.root.left.left=new Node(4);
     tree.root.left.right=new Node(5);
     tree.root.right.left=new Node(6);
     tree.root.right.right=new Node(7);


     System.out.println("In Order Traversal:");
     tree.InTraverse(tree.root);
    
     System.out.println("Pre Order Traversal:");
     tree.PreTraverse(tree.root);

     System.out.println("Post Order Traversal:");
     tree.PostTraverse(tree.root);

  }
}

