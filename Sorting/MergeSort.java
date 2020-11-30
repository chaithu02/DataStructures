class MergeSort
{
   public static void main(String args[])
   {
     int[] a={6,1,8,9,2,4,3,0};
     mergeSort(a,0,a.length);

    /*for(int i=0;i<a.length;i++)
    {
          System.out.println(a[i]);
    }*/
   }
 
   public static void mergeSort(int[]  a,int p,int r)
   {
     if(p<r)
     {
       int q=(p+r)/2;
       mergeSort(a,p,q);
       mergeSort(a,q+1,r);
       merge(a,p,q,r);
     }
   }

   public static void merge(int[] a,int p,int q,int r)
   {
      int l=q-p+1;
      int r1=r-q;

      int[] L=new int[l];
      int[] R=new int[r1];

      int i=0;

      for(i=0;i<l;i++)
      {
         L[i]=a[p+i];
         System.out.println(L[i]);
      }
   
      for(int j=0;j<r;j++)
      {
        R[j]=a[r+1+j];
        System.out.println(R[j]);
      }

      
    /*
      int i=p,j=q+1;
  
      for(int k=0;k<a.length;k++)
      {
  
        if(i<L && j<R)
        {
          if(a[i]<a[j])
          {
            a[k]=a[i];
            i++;
          }
          else
          {
             a[k]=a[j];
             j++;
          }
       }
     }
     return a;*/
   }
}
