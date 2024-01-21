
import java.util.Scanner;
public class Compare4Numbers {
        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);

            System.out.println("Enter a number");
            int number1 = obj.nextInt();

            System.out.println("Enter a number");
            int number2 = obj.nextInt();

            System.out.println("Enter a number");
            int number3 = obj.nextInt();

            System.out.println("Enter a number");
            int number4 = obj.nextInt();

            boolean result = (number1 == number2) && (number2 == number3) && (number3 == number4);
            String allEqual = result ? "Equal": "Not Equal";
            System.out.println("The given numbers are "+allEqual);

        }
    }
