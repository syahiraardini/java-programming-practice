public class LoginLogAnalyzer {
    public static void main(String[] args) {
        String[] usernames = {"alice", "bob","alice","admin","bob","alice","admin","admin","bob","alice"};
        int[] loginStatus = {1, 0, 1, 0, 0, 1, 0, 1, 0, 1};

        // successful logins
        int aliceSuccessfulLogins = countSuccessfulLogins(usernames, loginStatus, "alice");
        int bobSuccessfulLogins = countSuccessfulLogins(usernames, loginStatus, "bob");
        int adminSuccessfulLogins = countSuccessfulLogins(usernames, loginStatus, "admin");

        // failed logins
        int aliceFailedLogins = countFailedLogins(usernames, loginStatus, "alice");
        int bobFailedLogins = countFailedLogins(usernames, loginStatus, "bob");
        int adminFailedLogins = countFailedLogins(usernames, loginStatus, "admin");

        // displays

        System.out.println("Total login attempts: "+ loginStatus.length);
        System.out.println("Alice:");
        System.out.println("Successful: " + aliceSuccessfulLogins);
        System.out.println("Failed: "+ aliceFailedLogins);
        System.out.println("\nBob:");
        System.out.println("Successful: " + bobSuccessfulLogins);
        System.out.println("Failed: "+ bobFailedLogins);
        System.out.println("\nAdmin:");
        System.out.println("Successful: "+ adminSuccessfulLogins);
        System.out.println("Failed: "+ adminFailedLogins);
    }

    // counts the total number of successful logins of a specified user
    public static int countSuccessfulLogins(String[] usernames, int[] loginStatus, String username){
        int total = 0;

        for (int i = 0; i < loginStatus.length; i++) {
            if (usernames[i].equals(username) && loginStatus[i]==1) {
                total++;
            }
        }
        return total;
    }

    public static int countFailedLogins(String[] usernames, int[] loginStatus, String username){
        int total = 0;

        for (int i = 0; i < loginStatus.length; i++) {
            if (usernames[i].equals(username)&&loginStatus[i]==0) {
                total++;
            }
        }
        return total;
    }

    public static boolean containsUser(String[] usernames, String username){
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(username)) {
                return true;
            }
        }
        return false;
    }
}
