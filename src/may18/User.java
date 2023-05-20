package may18;

import java.util.regex.*;

public class User {
    private String email;
    private String password;

    public User(String email, String password) throws InvalidEmailException, InvalidPasswordException {
        if (!isValidEmail(email)) {
            throw new InvalidEmailException("Invalid email format");
        }

        if (!isValidPassword(password)) {
            throw new InvalidPasswordException("Invalid password");
        }

        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    private boolean isValidEmail(String email) {
        // Simple email regex pattern for demonstration purposes
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean isValidPassword(String password) {
        // Password validation logic (e.g., minimum length, complexity, etc.)
        return password.length() >= 8;
    }
}


