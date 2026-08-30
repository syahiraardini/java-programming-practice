//every method is an instance method so we need to create an object before calling method
public class StudentScoreAnalyzer {

    public static void main(String[] args) {

        int[] scores = {78, 92, 65, 88, 55, 91, 73, 84, 60, 97};
        int passingScore = 60;

        // Your code here
        StudentScoreAnalyzer analyzer = new StudentScoreAnalyzer();
        int highest = analyzer.calculateHighestScore(scores);
        int lowest = analyzer.calculateLowestScore(scores);
        double average = analyzer.calculateAverageScore(scores);
        int passed = analyzer.countStudentPassed(scores, passingScore);
        int failed = analyzer.countStudentFailed(scores, passingScore);

        System.out.println("Highest Score: "+ highest);
        System.out.println("Lowest Score: "+ lowest);
        System.out.println("Average Score: "+ average);
        System.out.println("Passed: "+ passed);
        System.out.println("Failed: "+ failed);
        
    }

    // Calculate the Highest Score
    public int calculateHighestScore(int[] scores) {
        int highestScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i]>highestScore) {
                highestScore = scores[i]; 
            }
        }

        return highestScore;
    }

    // Calculate the Lowest Score
    public int calculateLowestScore(int[] scores) {
        int lowestScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i]<lowestScore) {
                lowestScore = scores[i];
            }
        }

        return lowestScore;
    }

    // Calculate Average Score
    public double calculateAverageScore(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum+=scores[i];
        }

        return (double)sum/scores.length;
    }

    // Count Student Passed
    public int countStudentPassed(int[] scores, int passingScore){
        int numOfStudentPassed = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i]>=passingScore) {
                numOfStudentPassed++;
            }
        }

        return numOfStudentPassed;
    }

    // Count Student Failed
    public int countStudentFailed(int[] scores, int passingScore){
        int numOfFailedStudent = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i]<passingScore) {
                numOfFailedStudent++;
            }
        }

        return numOfFailedStudent;
    }
    
}
