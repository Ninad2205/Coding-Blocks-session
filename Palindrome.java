import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number string : ");
        int n=sc.nextInt();
        System.out.println(isPalindrome(n));
        sc.close();
        
        
    }
    public static boolean isPalindrome(int n)
    {
        int sum=0;
        int temp=n;
        while (temp>0) {
            int d=temp%10;
            sum=sum*10+d;
            temp=temp/10;
            
        }
        return sum==n;
        

    }
}