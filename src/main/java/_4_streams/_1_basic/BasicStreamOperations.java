package _4_streams._1_basic;

import _4_streams.model.Dish;
import _4_streams.model.DishType;
import _4_streams.model.Employee;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static _4_streams.model.Dish.menu;
import static _4_streams.model.Employee.getEmployees;

public class BasicStreamOperations {

    public static void main(String[] args) throws IOException {
        exercise19();
    }

    // TODO: Utwórz stream skladajacy sie z ponizszych wyrazów, zamień wszystkie litery na wielkie a następnie zamień go na listę.
    private static void exercise1() {
        List<String> names = Arrays.asList("Maciek", "Anastazja", "Mikołaj");

        List<String> result = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Do każdej liczby z listy dodaj 17, a następnie podziel przez 2. Wypisz wyniki
    public static void exercise2() {
        List<Integer> numbers = Arrays.asList(25, 11, 46, 23, 44);

        List<Double> result = numbers.stream()
                .map(n -> n + 17)
                .map(n -> n / 2.0)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Utwórz stream z dat 1966-06-20, 1968-05-08, 1969-01-21, 1996-06-25, 2007-09-12. Pobierz z nich dzień tygodnia i utwórz listę.
    public static void exercise3() {
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(1966, 6, 20),
                LocalDate.of(1968, 5, 8),
                LocalDate.of(1969, 1, 21),
                LocalDate.of(1996, 6, 25),
                LocalDate.of(2008, 9, 12)
        );

        List<DayOfWeek> result = dates.stream()
                .map(LocalDate::getDayOfWeek)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Znajdz wszystkie imiona zaczynajace sie na literę 'M'
    private static void exercise4() {
        List<String> names = Arrays.asList("Maciek", "Anastazja", "Mikołaj");

        List<String> result = names.stream()
                .filter(n -> n.startsWith("M"))
                .collect(Collectors.toList());

        System.out.println(result);

    }

    // TODO: Znajdź wyrazy, które mają więcej liter niż 7
    public static void exercise5() {
        List<String> result = Arrays.asList("poison", "install", "password", "confuse", "wander", "castle", "negligence")
                .stream()
                .filter(n -> n.length() > 7)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO:  Utwórz stream z dat 1966-06-20, 1968-05-08, 1969-01-21, 1996-06-25, 2007-09-12. Ile z nich ma parzysty dzień miesiąca?
    public static void exercise6() {
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(1966, 6, 20),
                LocalDate.of(1968, 5, 8),
                LocalDate.of(1969, 1, 21),
                LocalDate.of(1996, 6, 25),
                LocalDate.of(2008, 9, 12)
        );

        long result = dates.stream()
                .map(LocalDate::getDayOfMonth)
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println(result);
    }

    // TODO: Policz imiona zaczynajace sie na literę 'M'
    private static void exercise7() {
        List<String> names = Arrays.asList("Maciek", "Anastazja", "mikołaj");


    }

    // TODO: Utwórz stream składający się z liczb 33, 19, 15, 17, 12 i znajdź wszystkie liczby podzielne przez 3.
    public static void exercise8() {
        List<Integer> numbers = Arrays.asList(33, 19, 15, 17, 12 );
        List<Integer> result = numbers.stream()
                .filter(n -> n % 3 == 0)
                .collect(Collectors.toList());
        System.out.println(result);

    }

    // TODO: Znajdź wszystkie potęgi liczb 2, 4, 8, 16, 32, 64, 128 większe od 500.
    public static void exercise9() {
        List<Integer> numbers = Arrays.asList(2, 4, 8, 16, 32, 64, 128);

        List<Integer> result = numbers.stream()
                .map(n -> n * n)
                .filter(n -> n > 500)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Utwórz stream składający się z następujących dat 1992-08-25, 1895-01-20, 2019-08-16. Znajdź wszystkie daty których dzień tygodnia to PIĄTEK
    public static void exercise10() {
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(1992, 8, 25),
                LocalDate.of(1895, 1, 20),
                LocalDate.of(2019, 8, 16)
        );

        List<LocalDate> result = dates.stream()
                .filter(d -> d.getDayOfWeek().equals(DayOfWeek.FRIDAY))
                .collect(Collectors.toList());

        System.out.println(result);

    }

    // TODO: Wypisz imiona pracowników
    private static void exercise11() {
        List<Employee> employees = getEmployees();

        List<String> result = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Znajdź wszystkich pracowników którzy maja wiecej niz 38 lat
    private static void exercise12() {
        List<Employee> employees = getEmployees();

        List<Employee> result = employees.stream()
                .filter(e -> e.getAge() > 38)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Policz wszystkich pracowników zarabiajacych powyzej 5000 zł
    private static void exercise13() {
        List<Employee> employees = getEmployees();

        long result = employees.stream()
                .map(Employee::getSalary)
                .filter(s -> s.compareTo(BigDecimal.valueOf(5000)) > 0)
                .count();

        System.out.println(result);
    }

    // TODO: Wypisz pełne imiona (imię + nazwisko) pracowników z pensją mniejszą lub równą 3650 i poniżej 50 roku życia
    private static void exercise14() {
        List<Employee> employees = getEmployees();

        List<String> result = employees.stream()
                .filter(e -> e.getSalary().compareTo(BigDecimal.valueOf(3650)) <= 0)
                .filter(e -> e.getAge() < 50)
                .map(e -> e.getName() + " " + e.getSalary())
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Wypisz na ekran wszystkie wegetariańskie nazwy potraw
    private static void exercise15() {
        List<Dish> menu = Dish.menu();

        List<String> result = menu.stream()
                .filter(Dish::isVegetarian)
                .map(Dish::getName)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Jakie rodzaje ryb znajdują się w menu?
    private static void exercise16() {
        List<Dish> menu = Dish.menu();

        List<Dish> result = menu.stream()
                .filter(e -> e.getType().equals(DishType.FISH))
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Policz ilość mięsnych potraw, które mają mniej niż 500 kalorii
    private static void exercise17() {
        List<Dish> menu = Dish.menu();

        long result = menu.stream()
                .filter(d -> d.getType().equals(DishType.MEAT))
                .filter(d -> d.getCalories() < 500)
                .count();

        System.out.println(result);
    }

    // TODO: Wczytaj linijki z pliku 'files/search.txt', znajdź te które zawierają wyraz 'Article'
    //       TIP: Do wczytania zawartości pliku skorzystaj z klasy Files.
    private static void exercise18() throws IOException {
        List<String> result = Files.lines(Paths.get("files", "search.txt"))
                .filter(l -> l.contains("Article"))
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Policz linijki z pliku 'files/search.txt' które nie zawierają wyrazu 'did'. Zignoruj puste linie
    private static void exercise19() throws IOException {
        long result = Files.lines(Paths.get("files", "search.txt"))
                .filter(l -> !l.contains("did"))
                .filter(l -> !l.isEmpty())
                .count();

        System.out.println(result);
    }
}