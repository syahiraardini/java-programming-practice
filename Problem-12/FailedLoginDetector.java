public class FailedLoginDetector {
    public static void main(String[] args) {
        String[] usernames = {
    "alice", "bob", "alice", "admin", "bob",
    "alice", "admin", "admin", "bob", "alice",
    "bob", "admin"
};

int[] loginStatus = {
    1, 0, 1, 0, 0,
    1, 0, 1, 0, 1,
    0, 0
};

int aliceFailedLogins = countFailedLogins(usernames, loginStatus, "alice");

int bobFailedLogins = countFailedLogins(usernames, loginStatus, "bob");

int adminFailedLogins = countFailedLogins(usernames, loginStatus, "admin");

System.out.println("Alice:");
System.out.println("Failed logins: "+ aliceFailedLogins);
System.out.println(failedLoginStatus(usernames, loginStatus, "alice"));

System.out.println("\nBob: ");
System.out.println("Failed logins: "+ bobFailedLogins);
System.out.println(failedLoginStatus(usernames, loginStatus, "bob"));

System.out.println("\nAdmin: ");
System.out.println("Failed logins: "+ adminFailedLogins);
System.out.println(failedLoginStatus(usernames, loginStatus, "admin"));
    }

    public static int countFailedLogins(String[] usernames, int[] loginStatus, String username){
        int total = 0;

        for (int i = 0; i < loginStatus.length; i++) {
            if (usernames[i].equals(username) && loginStatus[i]==0) {
                total++;
            }
        }
        return total;
    }

    public static String failedLoginStatus(String[] usernames, int[] loginStatus, String username){
        if (countFailedLogins(usernames, loginStatus, username)>=3) {
            return "Status: Suspicious";
        }
        return "Status: Normal";
    }
}
