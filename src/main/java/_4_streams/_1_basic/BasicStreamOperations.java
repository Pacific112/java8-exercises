package _4_streams._1_basic;

import pl.infoshare.streams.model.Dish;
import pl.infoshare.streams.model.Employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static pl.infoshare.streams.model.Employee.getEmployees;

public class BasicStreamOperations {

    public static void main(String[] args) {
        exercise1();
    }

    // TODO: Utwórz stream skladajacy sie z ponizszych wyrazów, zamień wszystkie litery na wielkie a następnie zamień go na listę.
    private static void exercise1() {
        List<String> names = Arrays.asList("Maciek", "Anastazja", "Mikołaj");

    }

    // TODO: Do każdej liczby z listy dodaj 17, a następnie podziel przez 2. Wypisz wyniki
    public static void exercise2() {
        List<Integer> numbers = Arrays.asList(25, 11, 46, 23, 44);

    }

    // TODO: Utwórz stream z dat 1966-06-20, 1968-05-08, 1969-01-21, 1996-06-25, 2007-09-12. Pobierz z nich dzień tygodnia i utwórz listę.
    public static void exercise3() {
        List<LocalDate> dates = Arrays.asList();

    }

    // TODO: Znajdz wszystkie imiona zaczynajace sie na literę 'M'
    private static void exercise4() {
        List<String> names = Arrays.asList("Maciek", "Anastazja", "Mikołaj");

    }

    // TODO: Znajdź wyrazy, które mają więcej liter niż 7
    public static void exercise5() {
        Arrays.asList("poison", "install", "password", "confuse", "wander", "castle", "negligence");
    }

    // TODO:  Utwórz stream z dat 1966-06-20, 1968-05-08, 1969-01-21, 1996-06-25, 2007-09-12. Ile z nich ma parzysty dzień miesiąca?
    public static void exercise6() {
        List<LocalDate> dates = Arrays.asList();

    }

    // TODO: Policz imiona zaczynajace sie na literę 'M'
    private static void exercise7() {
        List<String> names = Arrays.asList("Maciek", "Anastazja", "mikołaj");


    }
    // TODO: Utwórz stream składający się z liczb 33, 19, 15, 17, 12 i znajdź wszystkie liczby podzielne przez 3.
    public static void exercise8() {
        List<Integer> numbers = Arrays.asList(33, 19, 15, 17, 12 );

    }
    // TODO: Znajdź wszystkie potęgi liczb 2, 4, 8, 16, 32, 64, 128 większe od 500.
    public static void exercise9() {
        List<Integer> numbers = Arrays.asList(2, 4, 8, 16, 32, 64, 128);

    }
    // TODO: Utwórz stream składający się z następujących dat 1992-08-25, 1895-01-20, 2019-08-16. Znajdź wszystkie daty których dzień tygodnia to PIĄTEK
    public static void exercise10() {
        List<LocalDate> dates = Arrays.asList();

    }
    // TODO: Wypisz imiona pracowników
    private static void exercise11() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Znajdź wszystkich pracowników którzy maja wiecej niz 38 lat
    private static void exercise12() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Policz wszystkich pracowników zarabiajacych powyzej 5000 zł
    private static void exercise13() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Wypisz pełne imiona (imię + nazwisko) pracowników z pensją mniejszą lub równą 3650 i poniżej 50 roku życia
    private static void exercise14() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Wypisz na ekran wszystkie wegetariańskie nazwy potraw
    private static void exercise15() {
        List<Dish> employees = Dish.menu();

    }

    // TODO: Jakie rodzaje ryb znajdują się w menu?
    private static void exercise16() {
        List<Dish> employees = Dish.menu();

    }

    // TODO: Policz ilość mięsnych potraw, które mają mniej niż 500 kalorii
    private static void exercise17() {
        List<Dish> employees = Dish.menu();

    }

    // TODO: Wczytaj linijki z pliku 'files/search.txt', znajdź te które zawierają wyraz 'Article'
    //       TIP: Do wczytania zawartości pliku skorzystaj z klasy Files.
    private static void exercise18() {

    }

    // TODO: Policz linijki z pliku 'files/search.txt' które nie zawierają wyrazu 'did'. Zignoruj puste linie
    private static void exercise19() {

    }
}