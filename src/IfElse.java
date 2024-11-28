
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {

        int age;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Age");
        age = input.nextInt();
        if (age >= 18) {

            System.out.println("You can Vote");
        } else {

            System.out.println("Sorry grow up !:)");
        }


    }
}
