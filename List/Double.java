class Double
{
  static Node head;
 
  static class Node
  {
    Node prev;
    Node next;
    int data;

    Node(int data)
    {
      this.data=data;
    }
  }

  public static void insertFirst(int data)
  {
    Node newNode=new Node(data);
  
    newNode.next=head;
    newNode.prev=null;

    if(head!=null)
    head.prev=newNode;

    head=newNode;
  }
  
  public static void insertLast(int data)
  {
      Node newNode=new Node(data);
      
      Node temp=head;

      while(temp.next!=null)
      {
        temp=temp.next;
      }

      
      temp.next=newNode;
      newNode.prev=temp;
      newNode.next=null;
  }

   public static void insertAfter(Node prv,int data)
   {
 
      Node  temp=head;
      Node prev=null;

      Node newNode=new Node(data);
      while(temp!=prv)
      {
        temp=temp.next;
      }

      prev=temp;
 
      newNode.next=prev.next;
      prev.next=newNode;
      prev.next.prev=newNode;
      newNode.prev=prev;
      
  }
      
  public static void deleteLast()
  {
    Node temp=head;
    Node prNode=null;

    while(temp.next!=null)
    {
      prNode=temp;
      temp=temp.next;
      
    }

    prNode.next=null;
    temp.prev=null;
  }

  public static void printList()
  {
     Node temp=head;
  
     while(temp!=null)
     {
        System.out.println(temp.data);
        temp=temp.next;
     }
 
   }


   public static void deleteKey(int key)
   {
      Node temp=head;
      Node prev=null;
 
      while(temp.data!=key)
      {
        prev=temp;
        temp=temp.next;
      }
   
      prev.next=temp.next;
      temp.next.prev=prev;
   }
    
   public static void main(String args[])
   {
     Double list=new Double();
     
     list.insertFirst(10);
     list.insertFirst(20);
     list.insertFirst(30);
     list.insertFirst(40);
     list.insertFirst(50);
     
     list.printList();
    
     list.insertLast(9);

 
     System.out.println("............");

     list.printList();
    
     System.out.println("...........");

     list.deleteLast();
     list.printList();

     System.out.println("...........");

     list.insertAfter(head.next,60);
     list.printList();
   
     System.out.println("...........");

     list.deleteKey(60);
     list.printList();
 
   }
}
 

   
   

    
 

 
