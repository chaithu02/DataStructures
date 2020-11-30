class SelectionSort
{ 
   public static void main(String args[])
   {
     
       //int a=selectionSort(new int[] {4,89,34,2,16});

       int[] a=new int[]{89,4,5,2,10};

       selectionSort(a);
   }


  public static void selectionSort(int[] a)
  {
    int min=0,temp=0,i=0,k=0;
   // int[] a=new int[ar.length];    

    for(i=0;i<a.length;i++)
    {
       min=a[i];
       
       for(int j=i+1;j<a.length;j++)
       {
          if(a[j]<min)
          {
            min=a[j];
            k=j;
          }
       }
       
       temp=k;

       if(i<temp)
       {
         a[temp]=a[i];
         a[i]=min;
       }
     }
   
     for(i=0;i<a.length;i++)
       {
         System.out.println(a[i]+" ");
       }
    
   }
}

   
 
