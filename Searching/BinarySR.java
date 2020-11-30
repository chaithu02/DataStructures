import java.util.*;

class BinarySR
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size:");
    int n=sc.nextInt();

    System.out.println("Enter the no:");
    int x=sc.nextInt();

    int[] a=new int[n];
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++)
    {
     a[i]=sc.nextInt();
    }

    int l=0,h=a.length-1;

   int res=binary(a,l,h,x);

   System.out.println(res);
   }

   public static int binary(int[] a,int l,int h,int x)
   {
     int mid=(l+h)/2;

     if(a[mid]==x)
     {
        return mid;
     }
     else if(a[mid]>x)
     {
       return binary(a,l,mid-1,x);
     }
     else
     {
       return binary(a,mid+1,h,x);
     }
   }
}
