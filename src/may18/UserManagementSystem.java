package may18;

public class UserManagementSystem {
    private User[] users;
    private int userCount;

    public UserManagementSystem() {
        users = new User[10];
        userCount = 0;
    }

    public void signup(String email, String password) {
        try {
            User user = new User(email, password);
            users[userCount] = user;
            userCount++;
            System.out.println("Signup successful");
        } catch (InvalidEmailException | InvalidPasswordException e) {
            System.out.println("Signup error: " + e.getMessage());
        }
    }

    public void login(String email, String password) {
        // Login logic
        // ...

        System.out.println("Login successful");
    }

    public static void main(String[] args) {
        UserManagementSystem userManagementSystem = new UserManagementSystem();

        // Signup example
        userManagementSystem.signup("example@gmail.com", "password123");

        // Invalid email format
        userManagementSystem.signup("example.com", "password123");

        // Invalid password length
        userManagementSystem.signup("example@gmail.com", "pass");

        // Login example
        userManagementSystem.login("example@gmail.com", "password123");
    }
}
