public class ArrayAnalysis {
    public static void main(String[] args) {
        int[] numbers = {12, -5, 0, 7, -3, 8, 0, 15, -10, 4};

        int numOfPositive = 0;
        int numOfNegative = 0;
        int numOfZero = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>0) {
                numOfPositive++;
            } else if (numbers[i]<0) {
                numOfNegative++;
            } else {
                numOfZero++;
            }

            sum+=numbers[i];
        }

        System.out.println("Positive: " + numOfPositive);
        System.out.println("Negative: " + numOfNegative);
        System.out.println("Zero: " + numOfZero);
        System.out.println("Sum: " + sum);
    }
}
