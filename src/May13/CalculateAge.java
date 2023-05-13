package May13;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.print("Doğum tarixinizi daxil edin (dd.MM.yyyy): ");
        String dateInput = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(dateInput, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);

        System.out.println("Indiki yashiniz: " + period.getYears());
    }
}
