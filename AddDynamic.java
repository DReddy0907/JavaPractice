import java.util.Scanner;

public class AddDynamic {
    public static  void main(String[] args) {
        Scanner var= new Scanner(System.in);

        System.out.println("Enter first number");
        int a =var.nextInt();

        System.out.println("Enter second number");
        int b=var.nextInt();

        System.out.println("The sum of two digits is "+(a+b));
        System.out.println("The difference of two digits is "+(a-b));
        System.out.println("The multiplication of two digits is "+(a*b));
        System.out.println("The division of two digits is "+(a/b));

    }
    }
