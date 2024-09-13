import java.util.*;
public class Armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number string : ");
        int n=sc.nextInt();
        System.out.println(isArmstrong(n));
        sc.close();
        
        
    }
    public static boolean isArmstrong(int n)
    {
        
        int sum=0;
        int temp=n;
        int count=0;
        while (temp>0) {
            temp=temp/10;
            count++;
            
        }
        temp=n;

        while (temp>0) {
            int d = temp % 10;
            int power=(int) Math.pow(d, count);
            sum =sum+power;
            temp = temp / 10;
            
        }
        // System.out.println(count);

        return sum==n;
        

    }
}