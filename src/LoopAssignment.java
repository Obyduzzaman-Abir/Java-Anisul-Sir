import java.util.Scanner;

public class LoopAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to calculate the factorial series: ");
        int n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            int facto = 1;
            for (int j = 1; j <= i; j++) {
                facto *= j;
            }

            // Print the factorial of the current number
            System.out.println("Factorial of " + i + " is: " + facto);
        }
    }
}
