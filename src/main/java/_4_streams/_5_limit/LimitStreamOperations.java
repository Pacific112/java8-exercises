package _4_streams._5_limit;

import _4_streams.model.Dish;
import _4_streams.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static _4_streams.model.Dish.menu;
import static _4_streams.model.Employee.getEmployees;

public class LimitStreamOperations {

    public static void main(String[] args) {
        exercise2();
    }

    // TODO: Wypisz 3 pierwszych pracowników
    private static void exercise1() {
        List<Employee> employees = getEmployees();

        List<Employee> result = employees.stream()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Wypisz 2 ostatnich pracowników
    private static void exercise2() {
        List<Employee> employees = getEmployees();

        List<Employee> result = employees.stream()
                .skip(employees.size() - 2)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Wypisz 3 najlepiej zarabiajacych pracowników
    private static void exercise3() {
        List<Employee> employees = getEmployees();

        List<Employee> result = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Znajdź trzy najbardziej kaloryczne dania?
    private static void exercise4() {
        List<Dish> menu = menu();

        List<Dish> result = menu.stream()
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Wypisz na ekran wiek pracowników. Nie powtarzaj tych samych wartości
    private static void exercise5() {
        List<Employee> employees = getEmployees();

        List<Integer> result = employees.stream()
                .map(Employee::getAge)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Upewnij się, że żaden z pracowników nie nazywa się tak samo
    private static void exercise6() {
        List<Employee> employees = getEmployees();

        List<String> result = employees.stream()
                .map(Employee::getName)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result.size() == employees.size());
    }

    // TODO: Znajdź najmłodszego pracownika
    private static void exercise7() {
        List<Employee> employees = getEmployees();

        Optional<Employee> result = employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .limit(1)
                .findFirst();

        System.out.println(result);
    }
}