import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0,temp,num,rem;
        num=input.nextInt();
        temp=num;
        for (int i=0;temp !=0;i++)
        {
            rem=temp%10;
            sum=sum +rem*rem*rem;
            temp=temp/10;
        }

        if (sum==num)
        {
            System.out.println("This is a Armstrong Number");
        }
        else
        {
            System.out.println("Not a Armstrong Please Try again Later");
        }
    }
}
