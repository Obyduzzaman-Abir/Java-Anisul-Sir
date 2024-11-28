import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int digit;
        System.out.println("Enter any digit");
        digit=input.nextInt();
        switch (digit)
        {
            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            default:
                System.out.println("Not a digit");


                System.out.println("Enter a number");


    }
        System.out.println("Enter new number to find large");
        int num1,num2;
        num1=input.nextInt();
        num2=input.nextInt();
        int large=(num1>num2)?num1:num2;
        System.out.println("Larger number is :"+large);

}

}


