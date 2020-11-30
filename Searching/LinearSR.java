class LinearSR
{
  public static void main(String args[])
  {
    int a[]=new int[]{1,5,4,2,3,6};
    int x=9,i=0;
    int res=recursiveLinearSearch(a,i,x);

    System.out.println(res);
  }

   public static int recursiveLinearSearch(int[] a,int i,int x)
   {
      int n=a.length-1;
       if(i>n)
       {
         return -1;
       }
       else if(a[i]==x)
       {
         return i;
       }
       else
       {
         return recursiveLinearSearch(a,i+1,x);
       }
    }
} 
       

  
    
   
