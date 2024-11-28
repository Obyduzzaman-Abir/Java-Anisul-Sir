import java.util.Scanner;
public class Series {
    public static void main(String[]args)
    {
        Scanner input =new Scanner(System.in);
        int n, product=1;
        System.out.println("Enter The last Num");
        n=input.nextInt();
        //1*2*3*....n
        for (int i = 1; i <= n; i++) {
            product=product*i;
        }
        System.out.println(product);
        int product2=1 , n2;
        Scanner input2 =new Scanner(System.in);
        System.out.println("Enter n2");
        n2=input2.nextInt();
        for (int i = 1; i <= n2; i=i+2) {
            product2=product2*i;
        }
        System.out.println(product2);
    }

}
