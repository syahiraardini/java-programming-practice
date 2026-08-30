public class MaximumFinder {
    public static void main(String[] args) {
        int[] numbers = {-8, -3, -15, -2};
        int maximumNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>maximumNumber) {
                maximumNumber = numbers[i];
            }
        }

        System.out.println("Maximum: " + maximumNumber);
    }
}
