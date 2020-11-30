class InsertionSort
{
  public static void main(String args[])
  {
     int[] a=insertionSort(new int[]{0,10,34,55,8,12});
     for(int i=0;i<a.length;i++)
     {
        System.out.print(a[i]+" ");
     }
  }

  public static int[] insertionSort(int[] a)
  {
     int k=0,temp=0;
     for(int i=0;i<a.length-1;i++)
     {
        k=i;
        for(int j=i+1;j>0 && j<a.length && k!=-1;j--)
        {
          if(a[j]<a[k])
          {
             temp=a[j];
             a[j]=a[k];
             a[k]=temp;
             k--;
           }
         }
         
       }
     return a;
    }
}
       
