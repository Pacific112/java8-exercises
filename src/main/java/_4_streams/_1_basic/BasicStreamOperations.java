package _4_streams._1_basic;

import _4_streams.model.Dish;
import _4_streams.model.DishType;
import _4_streams.model.Employee;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static _4_streams.model.Employee.getEmployees;

public class BasicStreamOperations {

    public static void main(String[] args) throws IOException {
        exercise1();
    }

    // TODO: Utwórz stream skladajacy sie z ponizszych wyrazów, zamień wszystkie litery na wielkie a następnie zamień go na listę.
    private static void exercise1() {
        List<String> names = Arrays.asList("Maciek", "Anastazja", "Mikołaj")
                .stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(names);
    }

    // TODO: Do każdej liczby z listy dodaj 17, a następnie podziel przez 2. Wypisz wyniki
    public static void exercise2() {
        List<Integer> numbers = Arrays.asList(25, 11, 46, 23, 44)
                .stream()
                .map(number -> number + 17)
                .map(number -> number / 2)
                .collect(Collectors.toList());

        System.out.println(numbers);
    }

    // TODO: Utwórz stream z dat 1966-06-20, 1968-05-08, 1969-01-21, 1996-06-25, 2007-09-12. Pobierz z nich dzień tygodnia i utwórz listę.
    public static void exercise3() {
        List<DayOfWeek> days = Arrays.asList("1966-06-20", "1968-05-08", "1969-01-21", "1996-06-25", "2007-09-12")
                .stream()
                .map(stringDate -> LocalDate.parse(stringDate))
                .map(date -> date.getDayOfWeek())
                .collect(Collectors.toList());

        System.out.println(days);
    }

    // TODO: Znajdz wszystkie imiona zaczynajace sie na literę 'M'
    private static void exercise4() {
        List<String> names = Arrays.asList("Maciek", "Anastazja", "Mikołaj")
                .stream()
                .filter(name -> name.startsWith("M"))
                .collect(Collectors.toList());

        System.out.println(names);
    }

    // TODO: Znajdź wyrazy, które mają więcej liter niż 7
    public static void exercise5() {
        List<String> words = Arrays.asList("poison", "install", "password", "confuse", "wander", "castle", "negligence")
                .stream()
                .filter(word -> word.length() > 7)
                .collect(Collectors.toList());

        System.out.println(words);
    }

    // TODO:  Utwórz stream z dat 1966-06-20, 1968-05-08, 1969-01-21, 1996-06-25, 2007-09-12. Ile z nich ma parzysty dzień miesiąca?
    public static void exercise6() {
        long numberOfDays = Arrays.asList("1966-06-20", "1968-05-08", "1969-01-21", "1996-06-25", "2007-09-12")
                .stream()
                .map(stringDate -> LocalDate.parse(stringDate))
                .map(date -> date.getDayOfMonth())
                .filter(day -> day % 2 == 0)
                .count();

        System.out.println(numberOfDays);
    }

    // TODO: Policz imiona zaczynajace sie na literę 'M'
    private static void exercise7() {
        long numberOfNames = Arrays.asList("Maciek", "Anastazja", "mikołaj")
                .stream()
                .filter(name -> name.startsWith("M"))
                .count();

        System.out.println(numberOfNames);
    }
    // TODO: Utwórz stream składający się z liczb 33, 19, 15, 17, 12 i znajdź wszystkie liczby podzielne przez 3.
    public static void exercise8() {
        List<Integer> numbers = Arrays.asList(33, 19, 15, 17, 12 )
                .stream()
                .filter(number -> number % 3 == 0)
                .collect(Collectors.toList());

    }
    // TODO: Znajdź wszystkie potęgi liczb 2, 4, 8, 16, 32, 64, 128 większe od 500.
    public static void exercise9() {
        List<Integer> numbers = Arrays.asList(2, 4, 8, 16, 32, 64, 128)
                .stream()
                .map(number -> number * number)
                .filter(number -> number > 500)
                .collect(Collectors.toList());

    }
    // TODO: Utwórz stream składający się z następujących dat 1992-08-25, 1895-01-20, 2019-08-16. Znajdź wszystkie daty których dzień tygodnia to PIĄTEK
    public static void exercise10() {
        List<LocalDate> dates = Arrays.asList("1992-08-25", "1895-01-20", "2019-08-16")
                .stream()
                .map(stringDate -> LocalDate.parse(stringDate))
                .filter(date -> date.getDayOfWeek() == DayOfWeek.FRIDAY)
                .collect(Collectors.toList());

    }
    // TODO: Wypisz imiona pracowników
    private static void exercise11() {
        List<String> employees = getEmployees()
                .stream()
                .map(employee -> employee.getName())
                .collect(Collectors.toList());

        System.out.println(employees);
    }

    // TODO: Znajdź wszystkich pracowników którzy maja wiecej niz 38 lat
    private static void exercise12() {
        List<Employee> employees = getEmployees()
                .stream()
                .filter(employee -> employee.getAge() > 38)
                .collect(Collectors.toList());

        System.out.println(employees);
    }

    // TODO: Policz wszystkich pracowników zarabiajacych powyzej 5000 zł
    private static void exercise13() {
        long employees = getEmployees()
                .stream()
                .map(employee -> employee.getSalary())
                .filter(salary -> salary.compareTo(BigDecimal.valueOf(5000)) > 0)
                .count();

        System.out.println(employees);
    }

    // TODO: Wypisz pełne imiona (imię + nazwisko) pracowników z pensją mniejszą lub równą 3650 i poniżej 50 roku życia
    private static void exercise14() {
        List<String> employees = getEmployees()
                .stream()
                .filter(employee -> employee.getSalary().compareTo(BigDecimal.valueOf(3650)) <= 0)
                .filter(employee -> employee.getAge() > 50)
                .map(employee -> employee.getName() + " " + employee.getSurname())
                .collect(Collectors.toList());

        System.out.println(employees);
    }

    // TODO: Wypisz na ekran wszystkie wegetariańskie nazwy potraw
    private static void exercise15() {
        List<String> dishes = Dish.menu()
                .stream()
                .filter(dish -> dish.isVegetarian())
                .map(dish -> dish.getName())
                .collect(Collectors.toList());

        System.out.println(dishes);
    }

    // TODO: Jakie rodzaje ryb znajdują się w menu?
    private static void exercise16() {
        List<String> dishes = Dish.menu()
                .stream()
                .filter(dish -> dish.getType() == DishType.FISH)
                .map(d -> d.getName())
                .collect(Collectors.toList());

        System.out.println(dishes);
    }

    // TODO: Policz ilość mięsnych potraw, które mają mniej niż 500 kalorii
    private static void exercise17() {
        long dishes = Dish.menu()
                .stream()
                .filter(dish -> dish.getType() == DishType.MEAT)
                .filter(dish -> dish.getCalories() < 500)
                .count();

        System.out.println(dishes);
    }

    // TODO: Wczytaj linijki z pliku 'files/search.txt', znajdź te które zawierają wyraz 'Article'
    //       TIP: Do wczytania zawartości pliku skorzystaj z klasy Files.
    private static void exercise18() throws IOException {
        Path filePath = Paths.get("files", "search.txt");
        List<String> lines = Files.lines(filePath)
                .filter(line -> line.contains("Article"))
                .collect(Collectors.toList());

        System.out.println(lines);
    }

    // TODO: Policz linijki z pliku 'files/search.txt' które nie zawierają wyrazu 'did'. Zignoruj puste linie
    private static void exercise19() throws IOException {
        Path filePath = Paths.get("files", "search.txt");
        long lines = Files.lines(filePath)
                .filter(line -> !line.isEmpty())
                .filter(line -> !line.contains("did"))
                .count();

        System.out.println(lines);
    }
}