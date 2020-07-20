import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the element and index at which to insert");
        int elem=sc.nextInt();
        int ind=sc.nextInt();
        if(ind<n)
        {
          for(int i=n;i>=ind;i--)
              arr[i]=arr[i-1];
          arr[ind]=elem;
          n++;
        }
        else if(ind>100)
            System.out.println("Index exceeds array size");
        else
        {
            arr[ind]=elem;
            n=ind+1;
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
