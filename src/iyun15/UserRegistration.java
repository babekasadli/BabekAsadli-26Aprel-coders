package iyun15;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class UserRegistration {
    private static final String USER_FILE_PATH = "src/iyun15/users.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username or email:");
        String usernameOrEmail = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        scanner.close();

        if (!isValidInput(usernameOrEmail, password)) {
            System.out.println("Invalid input. Please provide a valid username/email and password.");
        } else if (isUserRegistered(usernameOrEmail)) {
            System.out.println("User already registered.");
        } else {
            boolean registrationSuccess = registerUser(usernameOrEmail, password);
            if (registrationSuccess) {
                System.out.println("Registration successful.");
            } else {
                System.out.println("Error during registration.");
            }
        }
    }

    private static boolean isValidInput(String usernameOrEmail, String password) {
        return usernameOrEmail != null && !usernameOrEmail.isEmpty() && password != null && password.length() >= 8;
    }

    private static boolean isUserRegistered(String usernameOrEmail) {
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userInfo = line.split(",");
                String storedUsernameOrEmail = userInfo[0];
                if (usernameOrEmail.equals(storedUsernameOrEmail)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the user file: " + e.getMessage());
        }
        return false;
    }

    private static boolean registerUser(String usernameOrEmail, String password) {
        String hashedPassword = hashPassword(password);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE_PATH, true))) {
            writer.write(usernameOrEmail + "," + hashedPassword);
            writer.newLine();
            return true;
        } catch (IOException e) {
            System.err.println("Error writing to the user file: " + e.getMessage());
            return false;
        }
    }

    private static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());
            StringBuilder result = new StringBuilder();
            for (byte b : hashedBytes) {
                result.append(String.format("%02x", b));
            }
            return result.toString();
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error hashing the password: " + e.getMessage());
            return null;
        }
    }
}
