public class Array71 {
    public static void main(String[] args) {
        int[] number=new int [6];
        number[0]=10;
        number[1]=109;
        number[2]=1087;
        number[3]=104;
        number[4]=105;
        number[5]=106;
        int len=number.length;
        int sum=number[0]+number[1]+number[5];
        System.out.println("Sum is : "+ sum);
        System.out.println("Legth is"+len);
        System.out.println("zero index is "+number[0]);
    }
}
