class QuickSort
{
    public static void main(String args[])
    {
       int[] a={10,80,30,90,40,60,70};
       int[] b=quickSort(a,0,a.length-1);
 
       for(int i=0;i<b.length;i++)
       {
           System.out.println(b[i]);
       }
     }

     public static int[] quickSort(int[] a,int l,int h)
     {
       if(l<h)
       {
        int  m=partition(a,l,h);
        quickSort(a,l,m-1);
        quickSort(a,m+1,h);
       }
       return a;
      }
 
     public static int partition(int[] a,int l,int h)
     {
        int p=a[h];
        int i=l-1;
        int temp=0,j=0;

        for(j=l;j<a.length-1;j++)
        {
           if(a[j]<p)
           {
              i++;
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
           }
        }
        if(a[j]==p)
        {
           a[j]=a[i+1];
           a[i+1]=p;
        }
         return i+1;
      }
}
