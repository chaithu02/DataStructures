class SelectionSort1
{
  public static void main(String args[])
   {
     
     

       int[] a=new int[]{89,4,5,99,10};

       selectionSort(a);
   }


  public static void selectionSort(int[] a)
  {
    int min=0,temp=0,i=0;
     

    for(i=0;i<a.length;i++)
    {
       min=i;

       for(int j=i+1;j<a.length;j++)
       {
          if(a[j]<a[min])
          {
             min=j;
          }
       }
 
       temp=a[min];
       a[min]=a[i];
       a[i]=temp;
   
   }
    for(int k=0;k<a.length;k++)
    {
       System.out.println(a[k]+" ");
    }
 }
}
       

