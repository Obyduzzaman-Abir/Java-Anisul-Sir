import java.util.Scanner;
public class ArmStrongAssignment {
    public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
                System.out.print("start number: ");
                int m = input.nextInt();
                System.out.print("end number: ");
                int n = input.nextInt();
                int sum=0,r,temp,count=0;
        System.out.print("Armstong numbers Between M  to N : ");
        for (int i = m; i < n; i++) {
            temp = i;
            while(temp!=0 && i>10) {
                r = temp % 10;
                sum = sum + r * r * r;
                temp = temp / 10;
            }
            if (sum==i)
            {
                System.out.print(i+" ");
                count++;

            }
            sum=0;

        }
                System.out.println();
                int totalArmstrongNumber=count;
                System.out.print("Total armstrong numbers : "+totalArmstrongNumber);
            }
        }


