import java.util.Scanner;

public class LoginLogAnalyzer2 {
    public static void main(String[] args) {
        String[] usernames = {"alice", "bob","alice","admin","bob","alice","admin","admin","bob","alice"};
        int[] loginStatus = {1, 0, 1, 0, 0, 1, 0, 1, 0, 1};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String userInput = scanner.nextLine();
        boolean userExists = containsUser(usernames, userInput);

        if (userExists) {
            System.out.println("User found.");
            System.out.println("Successful logins: " + countSuccessfulLogins(usernames, loginStatus, userInput));
            System.out.println("Failed logins: "+ countFailedLogins(usernames, loginStatus, userInput));
        } else {
            System.out.println("User not found.");
        }

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
