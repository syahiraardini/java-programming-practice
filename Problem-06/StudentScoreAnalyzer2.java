// every method is set to static so we don't need to create object
public class StudentScoreAnalyzer2 {

    public static void main(String[] args) {

        int[] scores = {78, 92, 65, 88, 55, 91, 73, 84, 60, 97};
        int passingScore = 60;

        // Your code here
        int highest = calculateHighestScore(scores);
        int lowest = calculateLowestScore(scores);
        double average = calculateAverageScore(scores);
        int passed = countStudentPassed(scores, passingScore);
        int failed = countStudentFailed(scores, passingScore);

        System.out.println("Highest Score: "+ highest);
        System.out.println("Lowest Score: "+ lowest);
        System.out.println("Average Score: "+ average);
        System.out.println("Passed: "+ passed);
        System.out.println("Failed: "+ failed);
        
    }

    // Calculate the Highest Score
    public static int calculateHighestScore(int[] scores) {
        int highestScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i]>highestScore) {
                highestScore = scores[i]; 
            }
        }

        return highestScore;
    }

    
    // Calculate the Lowest Score
    public static int calculateLowestScore(int[] scores) {
        int lowestScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i]<lowestScore) {
                lowestScore = scores[i];
            }
        }

        return lowestScore;
    }

    // Calculate Average Score
    public static double calculateAverageScore(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum+=scores[i];
        }

        return (double)sum/scores.length;
    }

    // Count Student Passed
    public static int countStudentPassed(int[] scores, int passingScore){
        int numOfStudentPassed = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i]>=passingScore) {
                numOfStudentPassed++;
            }
        }

        return numOfStudentPassed;
    }

    // Count Student Failed
    public static int countStudentFailed(int[] scores, int passingScore){
        int numOfFailedStudent = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i]<passingScore) {
                numOfFailedStudent++;
            }
        }

        return numOfFailedStudent;
    }
    
}
