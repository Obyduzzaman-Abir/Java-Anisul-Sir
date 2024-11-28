
import java.util.Scanner;
public class Input {
    public static  void main(String[]args)
    {

        int id;
        String title;
        int price;
        String description;
        float call_time;
        System.out.print("Enter the id :");
        Scanner intput1 =new Scanner(System.in);
        id=intput1.nextInt();
        System.out.println("Id is :"+id);

        System.out.print("Enter the title :");
        Scanner intput2 =new Scanner(System.in);
        title=intput2.next();
        System.out.println("Title is :"+title);

        System.out.print("Enter the price :");
        Scanner intput3 =new Scanner(System.in);
        price=intput3.nextInt();
        System.out.println("Price is :"+price);

        System.out.print("Enter the About :");
        Scanner intput4 =new Scanner(System.in);
        description=intput4.nextLine();
        System.out.println("About phone :"+description);

        System.out.print("Enter the call_time :");
        Scanner intput5 =new Scanner(System.in);
        call_time=intput5.nextFloat();
        System.out.println("call time  is :"+call_time);


    }
}
