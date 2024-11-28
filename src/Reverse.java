import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int reverse =0,r,temp,num;
        System.out.println("Enter any number");
        num=input.nextInt();
        temp=num;
        for (int i = 0; temp!=0 ; i++) {
            r=temp%10;
            reverse=reverse*10+r;
            temp=temp/10;
        }
        System.out.println("Sum of digits " +reverse);
    }
}
