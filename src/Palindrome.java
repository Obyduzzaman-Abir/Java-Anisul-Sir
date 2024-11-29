import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0,temp,num,rem;
        num=input.nextInt();
        temp=num;
        for (int i=0;temp !=0;i++)
        {
            rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;
        }

        if (sum==num)
        {
            System.out.println("This is a Plindrome");
        }
        else
        {
            System.out.println("Not a Palindrome Please Try again Later");
        }
    }
}
