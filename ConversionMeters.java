import java.util.Scanner;

public class ConversionMeters {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number in inches");
        double inches = obj.nextDouble();
        double meters = 0.0254* inches;
        System.out.println("The"+ inches + " is equal to " + meters);
    }

}
