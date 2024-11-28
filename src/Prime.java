import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        //prime numbers 2 3 5 7 11
        //Not prime number 0 1
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any positive num");
        int num=input.nextInt();
        int count=0;
        for(int i=2;i<num;i++)
        {
            if (num%i==0){
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
