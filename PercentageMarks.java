import java.util.Scanner;

public class PercentageMarks {
    public static void main(String[] args) {
        Scanner Var = new Scanner(System.in);

        //Define number of subjects
        System.out.println("Enter number of subjects");
        int n = Var.nextInt();

        //Initialize the total value
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter subject marks" + (i + 1));
            int subject = Var.nextInt();
            if (subject > 35) {
                total += subject;
            }
            else {
                System.out.println("Student has failed in exams");
                return;
            }
        }
        System.out.println("Percentage = " + (total / n));
    }
}
