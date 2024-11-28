import java.util.Scanner;
public class Logical {

    public static void main(String[]args)
    {
        char ans;
        System.out.print("D you love Java");
        Scanner input=new Scanner(System.in);
        ans=input.next().charAt(0);
        if (ans=='y'||ans=='Y')
        {
            System.out.println("You are awsome");
        }

        else if (ans=='n'||ans=='N')
        {
            System.out.println("Explore and come back");
        }

        else {
            System.out.println("Learn English ,Invalid Input");
            }


    }

}
