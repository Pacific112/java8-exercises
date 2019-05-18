package _4_streams._3_matching;

import _4_streams.model.Dish;
import _4_streams.model.DishType;
import _4_streams.model.Employee;

import java.math.BigDecimal;
import java.util.List;

import static _4_streams.model.Dish.menu;
import static _4_streams.model.Employee.getEmployees;

public class MatchingStreamOperations {

    public static void main(String[] args) {
        exercise1();
    }

    // TODO: Sprawdź czy któryś z pracowników zarabia powyżej 10000 zł
    private static void exercise1() {
        List<Employee> employees = getEmployees();

        boolean result = employees.stream()
                .map(Employee::getSalary)
                .anyMatch(s -> s.compareTo(BigDecimal.valueOf(10_000)) > 0);

        System.out.println(result);
    }

    // TODO: Upewnij się, że zadne z dań nie przekracza 1000 kalorii
    public static void exercise2() {
        List<Dish> menu = menu();

        boolean result = menu.stream()
                .map(Dish::getCalories)
                .noneMatch(c -> c > 1000);

        System.out.println(result);
    }

    // TODO: Sprawdź czy któryś z pracowników ma imię krótsze niż 5 znaków
    private static void exercise3() {
        List<Employee> employees = getEmployees();

        boolean result = employees.stream()
                .map(Employee::getName)
                .map(String::length)
                .anyMatch(n -> n < 5);

        System.out.println(result);
    }

    // TODO: Sprawdź czy wszystkie nazwiska zaczynaja sie z wielkiej litery
    private static void exercise4() {
        List<Employee> employees = getEmployees();

        boolean result = employees.stream()
                .map(Employee::getSurname)
                .map(n -> n.charAt(0))
                .allMatch(Character::isUpperCase);


        System.out.println(result);
    }

    // TODO: Czy wszyscy pracownicy zarabiaja powyzej 2000 zł?
    private static void exercise5() {
        List<Employee> employees = getEmployees();

        boolean result = employees.stream()
                .map(Employee::getSalary)
                .allMatch(s -> s.compareTo(BigDecimal.valueOf(2000)) > 0);

        System.out.println(result);
    }

    // TODO: Upewnij się, że żaden z pracowników nie nazywa się John
    private static void exercise6() {
        List<Employee> employees = getEmployees();

        boolean result = employees.stream()
                .map(Employee::getName)
                .noneMatch("John"::equals);

        System.out.println(result);
    }

    // TODO: Czy menu zawiera dania wegetariańskie?
    private static void exercise7() {
        List<Dish> menu = menu();

        boolean result = menu.stream()
                .anyMatch(Dish::isVegetarian);

        System.out.println(result);
    }

    // TODO: Czy menu zawiera tylko dania wegetariańskie?
    private static void exercise8() {
        List<Dish> menu = menu();

        boolean result = menu.stream()
                .allMatch(Dish::isVegetarian);

        System.out.println(result);
    }

    // TODO: Czy wszystkie mięsne dania posiadają powyżej 500 kalorii?
    private static void exercise9() {
        List<Dish> menu = menu();

        boolean result = menu.stream()
                .filter(d -> d.getType() == DishType.MEAT)
                .map(Dish::getCalories)
                .allMatch(c -> c > 500);

        System.out.println(result);
    }
}