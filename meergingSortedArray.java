import java.util.Arrays;

public class meergingSortedArray {
    public static void main(String[] args) {
        int a[] = { 1, 5, 10, 15 };
        int b[] = { 2, 4, 6, 8 };
        int c[] = new int[a.length + b.length];


        for(int i=0;i<a.length;i++)
        {
        c[i]=a[i];
        }
        for(int i=0;i<b.length;i++)
        {
        c[a.length + i] = b[i];
        }
        Arrays.sort(c);
        for (int i = 0; i < c.length; i++) {
            System.out.print("   " + c[i]);
        }
    }
}
