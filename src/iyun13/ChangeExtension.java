package iyun13;

import java.io.File;

public class ChangeExtension {
    public static void main(String[] args) {
        String filePath = "src/iyun13/text.txt";
        String newFilePath = changeFileExtension(filePath, ".docx");

        File file = new File(filePath);
        File newFile = new File(newFilePath);

        if (file.renameTo(newFile)) {
            System.out.println("File extension changed successfully.");
        } else {
            System.out.println("Failed to change file extension.");
        }
    }

    private static String changeFileExtension(String filePath, String newExtension) {
        String fileName = new File(filePath).getName();
        String newFileName = fileName.substring(0, fileName.lastIndexOf('.')) + newExtension;
        return filePath.replace(fileName, newFileName);
    }
}
