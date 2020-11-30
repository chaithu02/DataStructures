class InsertionSort1
{
  public static void main(String... args) 
  {
      int a[]=insertionSort(new int[]{25,0,99,8,5,11});
      for(int i=0;i<a.length;i++)
      { 
         System.out.print(a[i]+" ");
      }
  }
 
  public static int[] insertionSort(int[] a)
  {
       int ele=0;
       for(int i=0;i<a.length;i++)
       {
           ele=a[i];
           int j=i-1;
           while(j>=0 && a[j]>ele)
           {
              a[j+1]=a[j];
              a[j]=ele;
              j--;
           }
        }
       return a;
   }
}
