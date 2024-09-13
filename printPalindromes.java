public class printPalindromes{
    public static void main(String[] args) {
        
        for(int i=100;i<=1000;i++)
        {
           if(isPalindrome(i)==true)
           {
            System.out.println(i);
           }
        }
        
        
        
    }
    public static boolean isPalindrome(int  n)
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