public class PasswordStrengthAnalyzer {
    public static void main(String[] args) {
        String password = "Cyber 123";
        boolean uppercase = hasUppercase(password);
        boolean lowercase = hasLowercase(password);
        boolean digit = hasDigit(password);
        boolean specialCharacter = hasSpecialCharacter(password);

        System.out.println("Password: " + password);
        System.out.println("\nLength: " + password.length());
        System.out.println("Has uppercase: " + uppercase);
        System.out.println("Has lowercase: " + lowercase);
        System.out.println("Has digit: " + digit);
        System.out.println("Has special character: " + specialCharacter);
        System.out.println("Strength: " + determineStrength(password));

    }

    // has uppercase?
    public static boolean hasUppercase(String password){
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // has lowercase?
    public static boolean hasLowercase(String password){
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // has digit?
    public static boolean hasDigit(String password){
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    // has special character?
    public static boolean hasSpecialCharacter(String password){
        for (int i=0; i<password.length(); i++){
            if (Character.isLetterOrDigit(password.charAt(i))){
                continue;
            } else {
                return true;
            }
        }

        return false;
    }

    public static String determineStrength(String password){
        
        if (password.length()<8) {
            return "Weak";
        } else if (hasUppercase(password) && hasLowercase(password) && hasDigit(password) && hasSpecialCharacter(password)) {
            return "Strong";
        } else {
            return "Medium";
        }
    }
}
