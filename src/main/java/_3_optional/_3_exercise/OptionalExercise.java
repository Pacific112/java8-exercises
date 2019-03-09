package _3_optional._3_exercise;

import java.time.YearMonth;
import java.util.Scanner;

public class OptionalExercise {

    public static final Scanner SCANNER = new Scanner(System.in);

    // TODO: Exercise 4 - Optional API
    //       1. Utwórz klasę Car która zawiera następująca pola: marka samochodu oraz miesiąc i rok produkcji
    //       2. Poproś użytkownika o podanie marki samochodu
    //       3. Spytaj użytkownika czy chce również podać datę produkcji auta, jeżeli się zgodzi pobierz ją od niego
    //       4. Utwórz instancję klasy Car i wpisz podane przez użytkownika informacje
    //       5. Dodaj metodę która obliczy wiek auta.
    //       6. Wypisz informacje o marce oraz wieku auta na ekran. Jeżeli użytkownik nie podał daty produkcji, powinno zostać wypisane: WIEK NIEZNANY
    public static void main(String[] args) {
        Car car = getCarInformation();

        if (car.getAge().isPresent()) {
            System.out.println(String.format("Marka auta: %s, wiek: %s", car.getBrand(), car.getAge().get()));
        } else {
            System.out.println(String.format("Marka auta: %s, wiek: NIEZNANY", car.getBrand()));
        }
    }

    private static Car getCarInformation() {
        System.out.print("Podaj markę auta: ");
        String carBrand = SCANNER.nextLine();

        System.out.print("Czy chcesz podać datę produkcji auta (yes/no)? ");
        String agreed = SCANNER.nextLine();
        if (agreed.equals("yes")) {
            System.out.print("Podaj datę produkcji (yyyy-MM): ");
            String date = SCANNER.nextLine();
            return Car.create(carBrand, YearMonth.parse(date));
        }

        return Car.unknownAge(carBrand);
    }
}
