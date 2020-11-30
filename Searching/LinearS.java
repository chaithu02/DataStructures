class LinearS
{
  public static void main(String... args)
  {
   // int[] a=new int[]{8,2,5,7,4,6};
    
    int[] a={8,2,5,7,4,6};
    int x=7;
    int res=search(a,x);
    System.out.println("The index value is " +res);   
  }

  public static int search(int[] a,int x)
  {
     int index=-1;
      for(int i=0;i<a.length;i++)
      {
        if(a[i]==x)
        {
          index=i;
          //return index;
        }
      } 
      return index; 
  }
}
        

