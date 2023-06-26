package iyun15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    public static void main(String[] args) {
        String filePath = "src/iyun15/metn.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int wordCount = 0;
            String line = reader.readLine();
            while (line != null) {
                String[] words = line.split(" ");
                wordCount += words.length;
                line = reader.readLine();
            }

            System.out.println("Number of words: " + wordCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
