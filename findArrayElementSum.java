import java.util.*;
public class findArrayElementSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size : ");
        int x=sc.nextInt();
        int arr[]=new int[x];
        int target=102;
        
        System.out.println("Enter array elements : ");
        for(int i=0;i<arr.length;i++)
        {
            int n=sc.nextInt();
            arr[i]=n;
        }
        sc.close();

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int sum=arr[i]+arr[j];
                if(sum==target)
                {
                    System.out.println("\nindex 1: "+i+"\t\tindex 2 :"+j);
                    return;

                }
            }

        }
    }
    
}
