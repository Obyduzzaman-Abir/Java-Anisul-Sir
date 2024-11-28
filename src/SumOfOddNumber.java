import java.util.Scanner;
public class SumOfOddNumber {

    public static void main(String[] args) {
        int m, n;
        int sum =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number :");
        m = input.nextInt();
        System.out.println("Enter End Number :");
        n = input.nextInt();
        for (int i = m; i <=n; i++) {
            if(i%2!=0)
                sum = sum+i;
        }
        System.out.println("This is odd number of M to N : "+sum);
    }
}
