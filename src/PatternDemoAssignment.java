import java.util.Scanner;
public class PatternDemoAssignment {
    public static void main(String[] args) {
        System.out.print("Enter number of lines : ");
        Scanner input=new Scanner(System.in);
        int n =input.nextInt();
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                if(col%2==0){
                    System.out.print( " " +"0");
                }
                else {
                    System.out.print(" "+ "1");
                }
            }

            System.out.println();
        }
    }
}
