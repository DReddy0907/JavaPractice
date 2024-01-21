import java.util.Scanner;


public class PowerNumber {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = obj.nextInt();

        System.out.println("Enter the power  number");
        int powerNumber = obj.nextInt();

        int total =(int) Math.pow(number,powerNumber);
        System.out.println("The total number is " + total );

       String pNumber =  number%2==0 ? "primeNumber":"oddNumber";
        System.out.println("The  number is " + pNumber );
    }
}
