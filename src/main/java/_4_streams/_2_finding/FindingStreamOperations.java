package _4_streams._2_finding;

import _4_streams.model.Dish;
import _4_streams.model.Employee;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static _4_streams.model.Dish.menu;
import static _4_streams.model.Employee.getEmployees;

public class FindingStreamOperations {

    public static void main(String[] args) {
        exercise1();
    }

    // TODO: Znajdź pierwsze imię spełniające następujące warunki: posiada powyżej 7 znaków i nie zaczyna się na literę A
    public static void exercise1() {
        List<String> names = Arrays.asList("Adam", "Aleksandra", "Bartek", "Wiktoria", "Kacper", "Artur", "Stanisław",
                "Jan", "Kacper", "Kalina", "Weronika", "Piotr", "Jeremiasz", "Zuzanna", "Kinga", "Alicja", "Michał");

        Optional<String> result = names.stream()
                .filter(n -> n.length() > 7)
                .filter(n -> !n.startsWith("A"))
                .findFirst();

        System.out.println(result);
    }

    // TODO: Wypisz na ekran imię dowolnego pracownika powyżej 60 roku życia. Jeżeli taki pracownik nie istnieje wypisz na ekran: 'Brak takiego pracownika'.
    public static void exercise2() {
        List<Employee> employees = getEmployees();

        String result = employees.stream()
                .filter(e -> e.getAge() > 60)
                .findFirst()
                .map(Employee::getName)
                .orElse("Brak takiego pracownika");

        System.out.println(result);
    }

    // TODO: Wypisz na ekran imię dowolnego pracownika poniżej 20 roku życia. Jeżeli taki pracownik nie istnieje wypisz na ekran: 'Brak takiego pracownika'.
    public static void exercise3() {
        List<Employee> employees = getEmployees();

        String result = employees.stream()
                .filter(e -> e.getAge() < 20)
                .findFirst()
                .map(Employee::getName)
                .orElse("Brak takiego pracownika");

        System.out.println(result);
    }

    // TODO: Sprawdź czy któryś z pracowników zarabia powyżej 10000 zł
    public static void exercise4() {
        List<Employee> employees = getEmployees();

        Optional<Employee> result = employees.stream()
                .filter(e -> e.getSalary().compareTo(BigDecimal.valueOf(10_000)) > 0)
                .findFirst();

        System.out.println(result.isPresent());
    }

    // TODO: Upewnij się, że zadne z dań nie przekracza 1000 kalorii
    public static void exercise5() {
        List<Dish> menu = menu();

        Optional<Dish> result = menu.stream()
                .filter(d -> d.getCalories() > 1000)
                .findFirst();

        System.out.println(!result.isPresent());
    }
}