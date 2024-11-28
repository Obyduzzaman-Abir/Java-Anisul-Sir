import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sum=0,r,temp,num;
        System.out.println("Enter any number");
        num=input.nextInt();
        temp=num;
        for (int i = 0; temp!=0 ; i++) {
            r=temp%10;
            sum=sum+r;
            temp=temp/10;
        }
        System.out.println("Sum of digits " +sum);

    }
}
