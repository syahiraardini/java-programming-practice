public class NumberAnalyzer{
    public static void main(String[] args) {
        int[] numbers = {14, 7, 22, 7, 31, 10, 22, 5, 18, 7};

        int evenNumbers = countEvenNumbers(numbers);
        int oddNumbers = countOddNumbers(numbers);
        int numGreaterThan15 = countNumbersGreaterThan15(numbers);
        int sumOfEven = calculateSumOfEven(numbers);

        int searchNum = 22;
        boolean found = searchNumber(numbers, searchNum);
       

        System.out.println("Total numbers: "+ numbers.length);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: "+ oddNumbers);
        System.out.println("Numbers greater than 15: " + numGreaterThan15);
        System.out.println("Sum of even numbers: " + sumOfEven);
        System.out.println("Search number: "+ searchNum);

        if (found) {
            System.out.println("Result: Found");
        } else {
            System.out.println("Result: Not Found");
        }
    
    }

    public static int countEvenNumbers(int[] numbers){
        int even = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0) {
                even++;
            }
        }
        return even;
    }

    public static int countOddNumbers(int[] numbers){
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2!=0) {
                odd++;
            }
        }
        return odd;
    }

    public static int countNumbersGreaterThan15(int[] numbers){
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>15) {
                counter++;
            }
        }
        return counter;
    }

    public static int calculateSumOfEven(int[] numbers){
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0) {
                sum+=numbers[i];
            }
        }
        return sum;
    }

    public static boolean searchNumber(int[] numbers, int num){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==num) {
                return true;
            }
        }
        return false;
    }
}