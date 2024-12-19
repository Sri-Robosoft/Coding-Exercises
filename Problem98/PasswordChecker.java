package Problem98;

import java.util.Scanner;

public class PasswordChecker {

    public static String checkPasswordStrength(String password) {
        int minLength = 8;
        String upperCasePattern = ".*[A-Z].*";
        String lowerCasePattern = ".*[a-z].*";
        String digitPattern = ".*\\d.*";
        String specialCharPattern = ".*[!@#$%^&*(),.?\":{}|<>].*";

        if (password.length() < minLength)
            return "Password must be at least 8 characters long.";

        if (!password.matches(upperCasePattern))
            return "Password must include at least one uppercase letter.";

        if (!password.matches(lowerCasePattern))
            return "Password must include at least one lowercase letter.";

        if (!password.matches(digitPattern))
            return "Password must include at least one number.";

        if (!password.matches(specialCharPattern))
            return "Password must include at least one special character.";

        return "Password is strong.";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password to check: ");
        String password = sc.nextLine();
        String result = checkPasswordStrength(password);
        System.out.println(result);
        sc.close();
    }
}
