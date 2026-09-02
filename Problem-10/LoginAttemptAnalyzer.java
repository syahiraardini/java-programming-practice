public class LoginAttemptAnalyzer {
    public static void main(String[] args) {
        int[] loginAttempts = {1, 0, 1, 1, 0, 0, 1, 1, 1, 0};

        int successful = countSuccessfulAttempts(loginAttempts);
        int failed = countFailedAttempts(loginAttempts);
        double failureRate = calculateFailureRate(loginAttempts);
        int maxConsecutiveFailures = maxConsecutiveFailures(loginAttempts);
        boolean detected = bruteForcePattern(loginAttempts);

        // displaying the results
        System.out.println("Total attempts: "+ loginAttempts.length);
        System.out.println("Successful logins: "+successful);
        System.out.println("Failed logins: "+ failed);
        System.out.printf("Failure rate: %.2f%%%n", failureRate);
        System.out.println("Maximum consecutive failures: " + maxConsecutiveFailures);
        
        if (detected) {
            System.out.println("Brute-force pattern: Detected");
        } else {
            System.out.println("Brute-force pattern: Not Detected");
        }

    }

    // counts the total of succesful login attempts
    public static int countSuccessfulAttempts(int[] loginAttempts){
        int total = 0;

        for (int i = 0; i < loginAttempts.length; i++) {
            if (loginAttempts[i]==1) {
                total++;
            }
        }
        return total;
    }

    // counts the total of failed login attempts
    public static int countFailedAttempts(int[] loginAttempts){
        int total = 0;
        
        for (int i = 0; i < loginAttempts.length; i++) {
            if (loginAttempts[i]==0) {
                total++;
            }
        }
        return total;
    }

    // calculates the rate of failure in login attempts
    public static double calculateFailureRate(int[] loginAttempts){
        return (double)countFailedAttempts(loginAttempts)/loginAttempts.length*100;
    }

    // determines the maximum numbers of consecutive failed login attempts
    public static int maxConsecutiveFailures(int[] loginAttempts){
        int current = 0;
        int maximum = 0;

        for (int i = 0; i < loginAttempts.length; i++) {
            if (loginAttempts[i]==0) {
                current++;
            } else {
                current=0;
            }

            if (current>maximum) {
                maximum=current;
            }
        }
        return maximum;
    }

    // detects brute-force pattern
    public static boolean bruteForcePattern(int[] loginAttempts){
        return (maxConsecutiveFailures(loginAttempts)>=3);
    }
}
