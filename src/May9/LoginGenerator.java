package May9;

import java.util.Random;

public class LoginGenerator {
    private final String username;
    private final String password;

    public LoginGenerator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static LoginGenerator loginGenerator(User user) {
        String username = user.getName().toLowerCase() + user.getSurname().toLowerCase();
        String password = generateRandomPassword();

        return new LoginGenerator(username, password);
    }
    private static String generateRandomPassword() {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";

        String allChars = capitalLetters + smallLetters + numbers + symbols;

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int randomIndex = random.nextInt(allChars.length());
            password.append(allChars.charAt(randomIndex));
        }

        return password.toString();
    }
}
