class List
{
  Node head;
  static class Node
  {
    int data;
    Node next;
    Node(int data)
    {
      this.data=data;
      this.next=null;
    }
  }

  public void add(int d)
  {
    Node newNode=new Node(d);
      
    newNode.next=head;
    head=newNode;
  }

  public void printList()
  {
    Node temp=head;
    while(temp!=null)
    {
      System.out.println(temp.data);
      temp=temp.next;
    }
  }

  public static void main(String args[])
  {
     List list=new List();

     list.add(10);
     list.add(20);
     list.add(30);
   
    list.printList();
  }
}

