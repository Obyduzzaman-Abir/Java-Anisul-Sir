
import java.util.Scanner;
public class PalindromeAssingment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1, n2, t, sum=0, count=0, r, i;
        System.out.print("Enter initial number:");
        n1=input.nextInt();
        System.out.print("Enter final number:");
        n2=input.nextInt();
        System.out.print("Pallindrome numbers from "+n1+" to "+n2+" are:");
        for(i=n1; i<=n2; i++)
        {
            t=i;
            while(t!=0 && i>10)
            {
                r=t%10;
                sum=sum*10+r;
                t=t/10;
            }
            if(sum==i)
            {
                System.out.print(i+" ");
                count++;
            }
            sum=0;
        }
        System.out.println();
        System.out.println("Total Palindrome numbers from "+n1+" to "+n2+" are:"+count);
    }
}