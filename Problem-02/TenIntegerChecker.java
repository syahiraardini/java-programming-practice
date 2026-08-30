import java.util.Scanner;

public class TenIntegerChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=1;
        int numOfPositive=0;
        int numOfNegative=0;
        int numOfZero=0; 

        while (i<=10) {
            System.out.print("Enter number " + i + ": ");
            int input = scanner.nextInt();

            if (input>0) {
                numOfPositive++;
            } else if (input<0) {
                numOfNegative++;
            } else {
                numOfZero++;
            }
            i++;
        }

        System.out.println("Positive: " + numOfPositive);
        System.out.println("Negative: " + numOfNegative);
        System.out.println("Zero: " + numOfZero);
    }
}
