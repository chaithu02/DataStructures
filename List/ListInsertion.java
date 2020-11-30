class ListInsertion
{
  static Node head;
  static class Node
  {
    int data;
    Node next;
    Node(int d)
    {
      data=d;
      next=null;
    }
  }

  public void add(int data)
  {
     Node newNode=new Node(data);
   
     if(head==null)
     {
      newNode=new Node(data);
     }
     
     
       newNode.next=head;
       head=newNode;
     
  }

  
 public void addLast(int data)
 {
   Node newNode=new Node(data);
  
   Node last=head;
   while(last.next!=null)
   {
     last=last.next;
   }
   
    last.next=newNode;
 }

  public static void afterNode(Node after,int data)
  {
    Node node=head;
    Node newNode=new Node(data);
    if(node==after)
    {
      node.next=newNode;
      newNode.next=node.next;
    }
    
    while(node!=after)
    {
      node=node.next;
    }
    
    node.next=newNode;
    newNode.next=node.next;
    
  } 

  public void printList()
  {
    Node temp=head;
    while(temp!=null)
    {
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
  }

 
  public static void main(String args[])
  {
     ListInsertion list=new ListInsertion();
    
     list.add(10);
     list.add(20);
     list.add(30);
     list.add(40);
     
     list.printList();
     System.out.println(" ");
     System.out.println(".........adding at last");
      
     list.addLast(50); 
     list.printList();

     System.out.println(" ");
     System.out.println(".........adding after");

     list.afterNode(head.next.next,30);
     list.printList();
          
   }
}
