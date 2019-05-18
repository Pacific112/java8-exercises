package _4_streams._4_sort;

import _4_streams.model.Dish;
import _4_streams.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static _4_streams.model.Dish.menu;
import static _4_streams.model.Employee.getEmployees;

public class SortStreamOperations {

    public static void main(String[] args) {
        exercise1();
    }

    // TODO: Napisz comparator który posortuje pracowników wg. nazwiska
    private static void exercise1() {
        List<Employee> employees = getEmployees();

    }

    // TODO: Posortuj pracowników według nazwiska
    private static void exercise2() {
        List<Employee> employees = getEmployees();

        List<Employee> result = employees.stream()
                .sorted(Comparator.comparing(Employee::getSurname))
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Posortuj pracowników od najmłodszego do najstarszego
    private static void exercise3() {
        List<Employee> employees = getEmployees();

        List<Employee> result = employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Posortuj dania od najbardziej do najmniej kalorycznych
    private static void exercise4() {
        List<Dish> menu = menu();

        List<Dish> result = menu.stream()
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Posortuj pracowników od najstarszego do najmłodszego
    private static void exercise5() {
        List<Employee> employees = getEmployees();

        List<Employee> result = employees.stream()
                .sorted(Comparator.comparing(Employee::getAge).reversed())
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // TODO: Posortuj pracowników według imienia, a następnie według nazwiska
    private static void exercise6() {
        List<Employee> employees = getEmployees();

        List<Employee> result = employees.stream()
                .sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSurname))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
