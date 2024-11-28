import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
        num= input.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.print(num +"*"+ i +"=" + num*i);
        }

    }

}
