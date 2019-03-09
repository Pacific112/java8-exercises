package _3_optional._4_exercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OptionalExercise2 {

    public static final Scanner SCANNER = new Scanner(System.in);

    // TODO:
    //       * Utwórz klasę PersonalData zawierającą następujące pola: Imię, Nazwisko, Wiek, Data urodzenia.
    //       * Napisz aplikację, która pobierze Imię, Nazwisko i datę urodzenia w formacje <miesiąc-dzień-rok>.
    //       * Oblicz wiek na podstawie pobranej daty.
    //       * Zapisz wszystkie informacje w klasie PersonalData.
    //       * Dopisz metodę getInfo do klasy PersonalData, która zwróci Stringa z informacjami tylko jeżeli osoba jest pełnoletnia.
    //       * Wyświetl informację na ekran
    public static void main(String[] args) {
        System.out.println("Imię: ");
        String name = SCANNER.nextLine();

        System.out.println("Nazwisko: ");
        String surname = SCANNER.nextLine();

        System.out.println("Data urodzenia: ");
        String dateOfBirth = SCANNER.nextLine();

        PersonalData personalData = new PersonalData(name, surname, LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("MM-dd-yyyy")));

        System.out.println(personalData.getInfo().orElse("Brak informacji"));
    }
}
