package _2_date._3_exercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FormatExercise {

    private final static Scanner scanner = new Scanner(System.in);

    // TODO: Exercise 2 - Date Formatting
    //       1. Napisz prostą aplikację która będzie przyjmować od użytkownika w formacie 31-12-1900 datę oraz liczbę dni która powinna do daty dodać
    //       2. Wypisz obliczoną datę w formacie 1900-31-Dec
    public static void main(String[] args) {
        System.out.print("Podaj datę: ");
        String dateString = scanner.nextLine();

        System.out.print("Podaj liczbę dni do dodania: ");
        int daysToAdd = scanner.nextInt();

        LocalDate parsedDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate newDate = parsedDate.plusDays(daysToAdd);

        System.out.println(newDate.format(DateTimeFormatter.ofPattern("yyyy-dd-MMM")));
    }
}
