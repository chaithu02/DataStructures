import java.util.*;

class BinaryS
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size:");
     int n=sc.nextInt();
   
     System.out.println("Enter x:");
     int x=sc.nextInt();
 
     int a[]=new int[n];

     for(int i=0;i<n;i++)
     {
       a[i]=sc.nextInt();
     }

     System.out.println("The index is "+binarySearch(a,x));
   }

   public static int binarySearch(int[] a,int x)
   {
      int low=0,high=a.length-1,mid=0;
      while(low<=high)
      {
        mid=(low+high)/2;
 
        if(a[mid]==x)
        {
          return mid;
        }

        else if(a[mid]>x)
        {
          high=mid-1;
        }
        else
        {
          low=mid+1;
        }
      }
     return -1;
   }
}
         
        


    
